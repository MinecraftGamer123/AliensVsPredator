package org.avp.block;

import java.util.Random;

import org.avp.AliensVsPredator;

import com.asx.mdx.lib.world.block.BlockMaterial;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class BlockOreSilicon extends BlockMaterial
{
    public BlockOreSilicon()
    {
        super(Material.ROCK);
        this.setHardness(50F);
        this.setResistance(20F);
    }
    
    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return AliensVsPredator.items().itemSilicon;
    }
    
    @Override
    public int quantityDropped(IBlockState state, int fortune, Random random)
    {
        return 1 + fortune + random.nextInt(3);
    }
}
