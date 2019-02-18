package org.avp.item.crafting;

import java.util.ArrayList;

import com.asx.mdx.MDX;
import com.asx.mdx.lib.world.entity.player.inventory.Inventories;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class AssemblyManager
{
    public static final AssemblyManager instance   = new AssemblyManager();
    private ArrayList<Schematic>        schematics = new ArrayList<Schematic>();

    public ArrayList<Schematic> schematics()
    {
        return this.schematics;
    }

    public static void register(Schematic schematic)
    {
        AssemblyManager.instance.add(schematic);
    }

    public ArrayList<Schematic> getSchematics(Item item)
    {
        ArrayList<Schematic> schematics = new ArrayList<Schematic>();

        for (Schematic schematic : this.schematics())
        {
            if (schematic.getItemStackAssembled() != null && schematic.getItemStackAssembled().getItem() == item)
            {
                schematics.add(schematic);
            }
        }

        return schematics;
    }

    public Schematic getSchematic(String id)
    {
        for (Schematic schematic : this.schematics())
        {
            if (schematic.getName().equalsIgnoreCase(id))
            {
                return schematic;
            }
        }

        return null;
    }

    public boolean isValid(Schematic schematic)
    {
        for (Schematic sch : this.schematics)
        {
            if (schematic == null || sch != null && schematic != null && sch.getName().equalsIgnoreCase(schematic.getName()))
            {
                return false;
            }
        }

        return true;
    }

    public void add(Schematic schematic)
    {
        if (isValid(schematic))
        {
            this.schematics.add(schematic);
        }
        else
        {
            MDX.log().warn(String.format("[AVP/API/Assembler] Schematic for id '%s' is already registered.", schematic.getName()));
        }
    }

    public static int amountForMatchingStack(EntityPlayer player, ItemStack requirement)
    {
        int count = 0;

        int[] matches = OreDictionary.getOreIDs(requirement);
        boolean checkOreDictionary = matches.length > 0;

        if (checkOreDictionary)
        {
            for (int id : matches)
            {
                String sharedName = OreDictionary.getOreName(id);

                for (ItemStack potentialMatch : OreDictionary.getOres(sharedName))
                {
                    count += Inventories.getAmountOfItemPlayerHas(potentialMatch.getItem(), player);
                }
            }
        }
        else
        {
            count += Inventories.getAmountOfItemPlayerHas(requirement.getItem(), player);
        }

        return count;
    }

    public static boolean handleAssembly(Schematic schematic, EntityPlayer player)
    {
        if (schematic != null && Schematic.isComplete(schematic, player))
        {
            for (ItemStack requirement : schematic.getItemsRequired())
            {
                if (requirement != null && requirement != ItemStack.EMPTY)
                {
                    int[] matches = OreDictionary.getOreIDs(requirement);
                    boolean checkOreDictionary = matches.length > 0;

                    if (checkOreDictionary)
                    {
                        matchLoop:
                        for (int id : matches)
                        {
                            String sharedName = OreDictionary.getOreName(id);

                            for (ItemStack potentialMatch : OreDictionary.getOres(sharedName))
                            {
                                if (Inventories.getAmountOfItemPlayerHas(potentialMatch.getItem(), player) >= requirement.getCount())
                                {
                                    for (int x = 0; x < requirement.getCount(); x++)
                                    {
                                        if (!Inventories.consumeItem(player, potentialMatch.getItem()))
                                        {
                                            return false;
                                        }
                                    }

                                    break matchLoop;
                                }
                            }
                        }
                    }
                    else
                    {
                        if (Inventories.getAmountOfItemPlayerHas(requirement.getItem(), player) >= requirement.getCount())
                        {
                            for (int x = 0; x < requirement.getCount(); x++)
                            {
                                if (!Inventories.consumeItem(player, requirement.getItem()))
                                {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }

            if (player.inventory.addItemStackToInventory(schematic.getItemStackAssembled().copy()))
            {
                return true;
            }
            else
            {
                new EntityItem(player.world, player.posX, player.posY, player.posZ, schematic.getItemStackAssembled().copy());
                return true;
            }
        }

        return false;
    }
}
