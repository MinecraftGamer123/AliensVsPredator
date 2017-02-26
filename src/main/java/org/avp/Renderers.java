package org.avp;

import static cpw.mods.fml.client.registry.ClientRegistry.bindTileEntitySpecialRenderer;
import static cpw.mods.fml.client.registry.RenderingRegistry.registerBlockHandler;
import static cpw.mods.fml.client.registry.RenderingRegistry.registerEntityRenderingHandler;
import static net.minecraftforge.client.MinecraftForgeClient.registerItemRenderer;

import org.avp.ItemHandler.Summoners;
import org.avp.block.render.RenderResin;
import org.avp.block.render.RenderShape;
import org.avp.client.model.items.Model88MOD4;
import org.avp.client.model.items.ModelAK47;
import org.avp.client.model.items.ModelM4;
import org.avp.client.model.items.ModelM41A;
import org.avp.client.model.items.ModelM56SG;
import org.avp.client.model.items.ModelSniper;
import org.avp.client.render.items.RenderItem88MOD4;
import org.avp.client.render.items.RenderItemAK47;
import org.avp.client.render.items.RenderItemAPC;
import org.avp.client.render.items.RenderItemAmpule;
import org.avp.client.render.items.RenderItemBlastDoor;
import org.avp.client.render.items.RenderItemCryostasisTube;
import org.avp.client.render.items.RenderItemGunLocker;
import org.avp.client.render.items.RenderItemLightPanel;
import org.avp.client.render.items.RenderItemLocker;
import org.avp.client.render.items.RenderItemM240ICU;
import org.avp.client.render.items.RenderItemM4;
import org.avp.client.render.items.RenderItemM40;
import org.avp.client.render.items.RenderItemM41A;
import org.avp.client.render.items.RenderItemM56SG;
import org.avp.client.render.items.RenderItemMedpod;
import org.avp.client.render.items.RenderItemMotionTracker;
import org.avp.client.render.items.RenderItemNostromoFlamethrower;
import org.avp.client.render.items.RenderItemPlasmaCannon;
import org.avp.client.render.items.RenderItemPowercell;
import org.avp.client.render.items.RenderItemPowerline;
import org.avp.client.render.items.RenderItemRedstoneFluxGenerator;
import org.avp.client.render.items.RenderItemRepulsionGenerator;
import org.avp.client.render.items.RenderItemSatelliteDish;
import org.avp.client.render.items.RenderItemSkull;
import org.avp.client.render.items.RenderItemSniper;
import org.avp.client.render.items.RenderItemSolarPanel;
import org.avp.client.render.items.RenderItemSpear;
import org.avp.client.render.items.RenderItemStasisMechanism;
import org.avp.client.render.items.RenderItemSummoner;
import org.avp.client.render.items.RenderItemSupplyChute;
import org.avp.client.render.items.RenderItemSupplyCrate;
import org.avp.client.render.items.RenderItemTransformer;
import org.avp.client.render.items.RenderItemTurret;
import org.avp.client.render.items.RenderItemWorkstation;
import org.avp.client.render.items.RenderItemWristbracer;
import org.avp.client.render.items.RenderItemWristbracerBlades;
import org.avp.client.render.items.parts.RenderItem88Mod4Action;
import org.avp.client.render.items.parts.RenderItem88Mod4Barrel;
import org.avp.client.render.items.parts.RenderItem88Mod4Stock;
import org.avp.client.render.items.parts.RenderItemAK47Action;
import org.avp.client.render.items.parts.RenderItemAK47Barrel;
import org.avp.client.render.items.parts.RenderItemAK47Stock;
import org.avp.client.render.items.parts.RenderItemM41AAction;
import org.avp.client.render.items.parts.RenderItemM41ABarrel;
import org.avp.client.render.items.parts.RenderItemM41APeripherals;
import org.avp.client.render.items.parts.RenderItemM41AStock;
import org.avp.client.render.items.parts.RenderItemM4Action;
import org.avp.client.render.items.parts.RenderItemM4Barrel;
import org.avp.client.render.items.parts.RenderItemM4Stock;
import org.avp.client.render.items.parts.RenderItemM56SGAction;
import org.avp.client.render.items.parts.RenderItemM56SGAimingModule;
import org.avp.client.render.items.parts.RenderItemM56SGBarrel;
import org.avp.client.render.items.parts.RenderItemM56SGStock;
import org.avp.client.render.items.parts.RenderItemM56SGSupportFrame;
import org.avp.client.render.items.parts.RenderItemSniperAction;
import org.avp.client.render.items.parts.RenderItemSniperBarrel;
import org.avp.client.render.items.parts.RenderItemSniperPeripherals;
import org.avp.client.render.items.parts.RenderItemSniperScope;
import org.avp.client.render.items.parts.RenderItemSniperStock;
import org.avp.entities.EntityAPC;
import org.avp.entities.EntityAcidPool;
import org.avp.entities.EntityAcidProjectile;
import org.avp.entities.EntityBullet;
import org.avp.entities.EntityFlame;
import org.avp.entities.EntityGrenade;
import org.avp.entities.EntityLaserMine;
import org.avp.entities.EntityLiquidLatexPool;
import org.avp.entities.EntityMechanism;
import org.avp.entities.EntityMedpod;
import org.avp.entities.EntityPlasma;
import org.avp.entities.EntityShuriken;
import org.avp.entities.EntitySmartDisc;
import org.avp.entities.EntitySpear;
import org.avp.entities.EntitySupplyChute;
import org.avp.entities.EntitySupplyChuteMarines;
import org.avp.entities.EntitySupplyChuteSeegson;
import org.avp.entities.EntityWristbracer;
import org.avp.entities.mob.EntityAethon;
import org.avp.entities.mob.EntityAqua;
import org.avp.entities.mob.EntityBabyhead;
import org.avp.entities.mob.EntityBatXeno;
import org.avp.entities.mob.EntityBelugaburster;
import org.avp.entities.mob.EntityBelugamorph;
import org.avp.entities.mob.EntityBoiler;
import org.avp.entities.mob.EntityChestburster;
import org.avp.entities.mob.EntityCombatSynthetic;
import org.avp.entities.mob.EntityCrusher;
import org.avp.entities.mob.EntityDeacon;
import org.avp.entities.mob.EntityDeaconShark;
import org.avp.entities.mob.EntityDracoEgg;
import org.avp.entities.mob.EntityDracoburster;
import org.avp.entities.mob.EntityDracomorph;
import org.avp.entities.mob.EntityDrone;
import org.avp.entities.mob.EntityEngineer;
import org.avp.entities.mob.EntityFacehugger;
import org.avp.entities.mob.EntityGooMutant;
import org.avp.entities.mob.EntityHammerpede;
import org.avp.entities.mob.EntityMarine;
import org.avp.entities.mob.EntityMyceliomorph;
import org.avp.entities.mob.EntityOctohugger;
import org.avp.entities.mob.EntityOvamorph;
import org.avp.entities.mob.EntityPantheramorph;
import org.avp.entities.mob.EntityPraetorian;
import org.avp.entities.mob.EntityPredalien;
import org.avp.entities.mob.EntityPredalienChestburster;
import org.avp.entities.mob.EntityPredatorHound;
import org.avp.entities.mob.EntityQueen;
import org.avp.entities.mob.EntityQueenChestburster;
import org.avp.entities.mob.EntityRoyalFacehugger;
import org.avp.entities.mob.EntityRunnerChestburster;
import org.avp.entities.mob.EntityRunnerDrone;
import org.avp.entities.mob.EntityRunnerWarrior;
import org.avp.entities.mob.EntityScelemur;
import org.avp.entities.mob.EntitySpaceJockey;
import org.avp.entities.mob.EntitySpitter;
import org.avp.entities.mob.EntityTrilobite;
import org.avp.entities.mob.EntityUltramorph;
import org.avp.entities.mob.EntityUrsuidae;
import org.avp.entities.mob.EntityWarrior;
import org.avp.entities.mob.EntityYautja;
import org.avp.entities.mob.EntityYautjaBerserker;
import org.avp.entities.mob.EntityYautjaMutant;
import org.avp.entities.mob.render.RenderAethon;
import org.avp.entities.mob.render.RenderAqua;
import org.avp.entities.mob.render.RenderBabyhead;
import org.avp.entities.mob.render.RenderBelugaburster;
import org.avp.entities.mob.render.RenderBoiler;
import org.avp.entities.mob.render.RenderChestburster;
import org.avp.entities.mob.render.RenderCombatSynthetic;
import org.avp.entities.mob.render.RenderDeaconShark;
import org.avp.entities.mob.render.RenderDracoEgg;
import org.avp.entities.mob.render.RenderDracoburster;
import org.avp.entities.mob.render.RenderDracomorph;
import org.avp.entities.mob.render.RenderEngineer;
import org.avp.entities.mob.render.RenderFacehugger;
import org.avp.entities.mob.render.RenderGooMutant;
import org.avp.entities.mob.render.RenderHammerpede;
import org.avp.entities.mob.render.RenderMarine;
import org.avp.entities.mob.render.RenderMyceliomorph;
import org.avp.entities.mob.render.RenderOctohugger;
import org.avp.entities.mob.render.RenderOvamorph;
import org.avp.entities.mob.render.RenderPredalien;
import org.avp.entities.mob.render.RenderPredalienChestburster;
import org.avp.entities.mob.render.RenderPredatorHound;
import org.avp.entities.mob.render.RenderQueen;
import org.avp.entities.mob.render.RenderQueenChestburster;
import org.avp.entities.mob.render.RenderRoyalFacehugger;
import org.avp.entities.mob.render.RenderRunnerChestburster;
import org.avp.entities.mob.render.RenderSpitter;
import org.avp.entities.mob.render.RenderTrilobite;
import org.avp.entities.mob.render.RenderUrsuidae;
import org.avp.entities.mob.render.RenderVardaMonkey;
import org.avp.entities.mob.render.RenderXenomorph;
import org.avp.entities.mob.render.RenderYautja;
import org.avp.entities.mob.render.RenderYautjaBerserker;
import org.avp.entities.mob.render.RenderYautjaMutant;
import org.avp.entities.render.RenderAPC;
import org.avp.entities.render.RenderAcidPool;
import org.avp.entities.render.RenderAcidSpit;
import org.avp.entities.render.RenderBullet;
import org.avp.entities.render.RenderDisc;
import org.avp.entities.render.RenderFlame;
import org.avp.entities.render.RenderGrenade;
import org.avp.entities.render.RenderLaserMine;
import org.avp.entities.render.RenderLiquidLatexPool;
import org.avp.entities.render.RenderMechanism;
import org.avp.entities.render.RenderMedpodEntity;
import org.avp.entities.render.RenderPlasmaBlast;
import org.avp.entities.render.RenderShuriken;
import org.avp.entities.render.RenderSpear;
import org.avp.entities.render.RenderSupplyChute;
import org.avp.entities.render.RenderWristbracer;
import org.avp.entities.tile.TileEntityAmpule;
import org.avp.entities.tile.TileEntityAssembler;
import org.avp.entities.tile.TileEntityBlastdoor;
import org.avp.entities.tile.TileEntityCryostasisTube;
import org.avp.entities.tile.TileEntityGunLocker;
import org.avp.entities.tile.TileEntityHiveResin;
import org.avp.entities.tile.TileEntityLightPanel;
import org.avp.entities.tile.TileEntityLocker;
import org.avp.entities.tile.TileEntityMedpod;
import org.avp.entities.tile.TileEntityNegativeTransformer;
import org.avp.entities.tile.TileEntityPowercell;
import org.avp.entities.tile.TileEntityPowerline;
import org.avp.entities.tile.TileEntityRedstoneEmitter;
import org.avp.entities.tile.TileEntityRedstoneFluxGenerator;
import org.avp.entities.tile.TileEntityRedstoneSensor;
import org.avp.entities.tile.TileEntityRepulsionGenerator;
import org.avp.entities.tile.TileEntitySatelliteDish;
import org.avp.entities.tile.TileEntitySatelliteModem;
import org.avp.entities.tile.TileEntitySkull;
import org.avp.entities.tile.TileEntitySolarPanel;
import org.avp.entities.tile.TileEntityStasisMechanism;
import org.avp.entities.tile.TileEntitySupplyCrate;
import org.avp.entities.tile.TileEntityTransformer;
import org.avp.entities.tile.TileEntityTurret;
import org.avp.entities.tile.TileEntityWorkstation;
import org.avp.entities.tile.render.RenderAmpule;
import org.avp.entities.tile.render.RenderAssembler;
import org.avp.entities.tile.render.RenderBlastdoor;
import org.avp.entities.tile.render.RenderCryostasisTube;
import org.avp.entities.tile.render.RenderGunLocker;
import org.avp.entities.tile.render.RenderHiveResin;
import org.avp.entities.tile.render.RenderLightPanel;
import org.avp.entities.tile.render.RenderLocker;
import org.avp.entities.tile.render.RenderMedpod;
import org.avp.entities.tile.render.RenderPowercell;
import org.avp.entities.tile.render.RenderPowerline;
import org.avp.entities.tile.render.RenderRedstoneEmitter;
import org.avp.entities.tile.render.RenderRedstoneFluxGenerator;
import org.avp.entities.tile.render.RenderRedstoneSensor;
import org.avp.entities.tile.render.RenderRepulsionGenerator;
import org.avp.entities.tile.render.RenderSatelliteDish;
import org.avp.entities.tile.render.RenderSatelliteModem;
import org.avp.entities.tile.render.RenderSkull;
import org.avp.entities.tile.render.RenderSolarPanel;
import org.avp.entities.tile.render.RenderStasisMechanism;
import org.avp.entities.tile.render.RenderSupplyCrate;
import org.avp.entities.tile.render.RenderTransformer;
import org.avp.entities.tile.render.RenderTurret;
import org.avp.entities.tile.render.RenderWorkstation;
import org.avp.event.client.render.transforms.CryostasisTubeRenderers;
import org.avp.event.client.render.transforms.FaceLocationTransforms;
import org.avp.event.client.render.transforms.MedpodTransforms;
import org.avp.event.client.render.transforms.VanillaFaceLocationTransforms;

import com.arisux.mdxlib.lib.client.TexturedModel;
import com.arisux.mdxlib.lib.game.IPostInitEvent;

import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.Item;

@SideOnly(Side.CLIENT)
public class Renderers implements IPostInitEvent
{
    public static Renderers instance = new Renderers();

    @Override
    public void post(FMLPostInitializationEvent event)
    {
        registerSimpleBlockRenderingHandlers();
        registerTileEntitySpecialRenderers();
        registerItemRenderers(AliensVsPredator.items());
        registerLivingEntityRenderers();
        registerStandardEntityRenderers();
        CryostasisTubeRenderers.register();
        MedpodTransforms.register();
        FaceLocationTransforms.register();
        VanillaFaceLocationTransforms.register();
    }

    private void registerLivingEntityRenderers()
    {
        registerEntityRenderingHandler(EntityEngineer.class, new RenderEngineer());
        registerEntityRenderingHandler(EntitySpaceJockey.class, new RenderEngineer(AliensVsPredator.resources().models().SPACE_JOCKEY));
        registerEntityRenderingHandler(EntityYautjaBerserker.class, new RenderYautjaBerserker());
        registerEntityRenderingHandler(EntityTrilobite.class, new RenderTrilobite());
        registerEntityRenderingHandler(EntityHammerpede.class, new RenderHammerpede());
        registerEntityRenderingHandler(EntityDeacon.class, new RenderXenomorph(AliensVsPredator.resources().models().PROTOMORPH, 1.4F));
        registerEntityRenderingHandler(EntityDrone.class, new RenderXenomorph(AliensVsPredator.resources().models().DRONE_ADVANCED, 0.9F));
        registerEntityRenderingHandler(EntityWarrior.class, new RenderXenomorph(AliensVsPredator.resources().models().WARRIOR, 1F));
        registerEntityRenderingHandler(EntityPraetorian.class, new RenderXenomorph(AliensVsPredator.resources().models().PRAETORIAN, 1.4F));
        registerEntityRenderingHandler(EntityRunnerDrone.class, new RenderXenomorph(AliensVsPredator.resources().models().RUNNER_DRONE, 0.9F));
        registerEntityRenderingHandler(EntityRunnerWarrior.class, new RenderXenomorph(AliensVsPredator.resources().models().RUNNER_WARRIOR, 1F));
        registerEntityRenderingHandler(EntityCrusher.class, new RenderXenomorph(AliensVsPredator.resources().models().CRUSHER, 1F));
        registerEntityRenderingHandler(EntityAqua.class, new RenderAqua());
        registerEntityRenderingHandler(EntityPredalien.class, new RenderPredalien());
        registerEntityRenderingHandler(EntitySpitter.class, new RenderSpitter());
        registerEntityRenderingHandler(EntityMarine.class, new RenderMarine());
        registerEntityRenderingHandler(EntityCombatSynthetic.class, new RenderCombatSynthetic());
        registerEntityRenderingHandler(EntityYautja.class, new RenderYautja());
        registerEntityRenderingHandler(EntityQueen.class, new RenderQueen());
        registerEntityRenderingHandler(EntityFacehugger.class, new RenderFacehugger());
        registerEntityRenderingHandler(EntityRoyalFacehugger.class, new RenderRoyalFacehugger());
        registerEntityRenderingHandler(EntityChestburster.class, new RenderChestburster());
        registerEntityRenderingHandler(EntityOvamorph.class, new RenderOvamorph());
        registerEntityRenderingHandler(EntityDeaconShark.class, new RenderDeaconShark());
        registerEntityRenderingHandler(EntityUltramorph.class, new RenderXenomorph(AliensVsPredator.resources().models().ULTRAMORPH, 1.5F));
        registerEntityRenderingHandler(EntityGooMutant.class, new RenderGooMutant());
        registerEntityRenderingHandler(EntityAethon.class, new RenderAethon());
        registerEntityRenderingHandler(EntityOctohugger.class, new RenderOctohugger());
        registerEntityRenderingHandler(EntityBelugaburster.class, new RenderBelugaburster());
        registerEntityRenderingHandler(EntityBelugamorph.class, new RenderXenomorph(AliensVsPredator.resources().models().BELUGAMORPH, 1F));
        registerEntityRenderingHandler(EntityPredalienChestburster.class, new RenderPredalienChestburster());
        registerEntityRenderingHandler(EntityQueenChestburster.class, new RenderQueenChestburster());
        registerEntityRenderingHandler(EntityRunnerChestburster.class, new RenderRunnerChestburster());
        registerEntityRenderingHandler(EntityBabyhead.class, new RenderBabyhead());
        registerEntityRenderingHandler(EntityBatXeno.class, new RenderXenomorph(AliensVsPredator.resources().models().BAT_XENO, 0.75F));
        registerEntityRenderingHandler(EntityBoiler.class, new RenderBoiler());
        registerEntityRenderingHandler(EntityDracoburster.class, new RenderDracoburster());
        registerEntityRenderingHandler(EntityDracoEgg.class, new RenderDracoEgg());
        registerEntityRenderingHandler(EntityDracomorph.class, new RenderDracomorph());
        registerEntityRenderingHandler(EntityMyceliomorph.class, new RenderMyceliomorph());
        registerEntityRenderingHandler(EntityPantheramorph.class, new RenderXenomorph(AliensVsPredator.resources().models().PANTHERAMORPH, 0.75F));
        registerEntityRenderingHandler(EntityPredatorHound.class, new RenderPredatorHound());
        registerEntityRenderingHandler(EntityUrsuidae.class, new RenderUrsuidae());
        registerEntityRenderingHandler(EntityScelemur.class, new RenderVardaMonkey());
        registerEntityRenderingHandler(EntityYautjaMutant.class, new RenderYautjaMutant());
    }

    private void registerStandardEntityRenderers()
    {
        registerEntityRenderingHandler(EntitySpear.class, new RenderSpear());
        registerEntityRenderingHandler(EntityLaserMine.class, new RenderLaserMine());
        registerEntityRenderingHandler(EntityGrenade.class, new RenderGrenade());
        registerEntityRenderingHandler(EntityFlame.class, new RenderFlame());
        registerEntityRenderingHandler(EntityAcidPool.class, new RenderAcidPool());
        registerEntityRenderingHandler(EntityLiquidLatexPool.class, new RenderLiquidLatexPool());
        registerEntityRenderingHandler(EntityPlasma.class, new RenderPlasmaBlast());
        registerEntityRenderingHandler(EntityAcidProjectile.class, new RenderAcidSpit());
        registerEntityRenderingHandler(EntitySmartDisc.class, new RenderDisc());
        registerEntityRenderingHandler(EntityShuriken.class, new RenderShuriken());
        registerEntityRenderingHandler(EntityBullet.class, new RenderBullet());
        registerEntityRenderingHandler(EntityWristbracer.class, new RenderWristbracer());
        registerEntityRenderingHandler(EntityAPC.class, new RenderAPC());
        registerEntityRenderingHandler(EntityMechanism.class, new RenderMechanism());
        registerEntityRenderingHandler(EntityMedpod.class, new RenderMedpodEntity());
        registerEntityRenderingHandler(EntitySupplyChute.class, new RenderSupplyChute());
        registerEntityRenderingHandler(EntitySupplyChuteMarines.class, new RenderSupplyChute());
        registerEntityRenderingHandler(EntitySupplyChuteSeegson.class, new RenderSupplyChute());
    }

    private void registerItemRenderers(ItemHandler items)
    {
        registerItemRenderer(Item.getItemFromBlock(AliensVsPredator.blocks().blockSkullEngineer), new RenderItemSkull());
        registerItemRenderer(Item.getItemFromBlock(AliensVsPredator.blocks().blockSkullSpaceJockey), new RenderItemSkull());
        registerItemRenderer(Item.getItemFromBlock(AliensVsPredator.blocks().blockSkullXenomorph), new RenderItemSkull());
        registerItemRenderer(Item.getItemFromBlock(AliensVsPredator.blocks().blockSkullXenomorphWarrior), new RenderItemSkull());
        registerItemRenderer(Item.getItemFromBlock(AliensVsPredator.blocks().blockSkullYautja), new RenderItemSkull());

        registerItemRenderer(Item.getItemFromBlock(AliensVsPredator.blocks().blockTurret), new RenderItemTurret());
        registerItemRenderer(Item.getItemFromBlock(AliensVsPredator.blocks().blockWorkstation), new RenderItemWorkstation());
        registerItemRenderer(Item.getItemFromBlock(AliensVsPredator.blocks().blockStasisMechanism), new RenderItemStasisMechanism());
        registerItemRenderer(Item.getItemFromBlock(AliensVsPredator.blocks().blockCryostasisTube), new RenderItemCryostasisTube());
        registerItemRenderer(Item.getItemFromBlock(AliensVsPredator.blocks().blockRepulsionGenerator), new RenderItemRepulsionGenerator());
        registerItemRenderer(Item.getItemFromBlock(AliensVsPredator.blocks().blockBlastdoor), new RenderItemBlastDoor());
        registerItemRenderer(Item.getItemFromBlock(AliensVsPredator.blocks().blockLightPanel), new RenderItemLightPanel());
        registerItemRenderer(Item.getItemFromBlock(AliensVsPredator.blocks().blockPowerline), new RenderItemPowerline());
        registerItemRenderer(Item.getItemFromBlock(AliensVsPredator.blocks().blockSolarPanel), new RenderItemSolarPanel());
        registerItemRenderer(Item.getItemFromBlock(AliensVsPredator.blocks().blockPowercell), new RenderItemPowercell());
        registerItemRenderer(Item.getItemFromBlock(AliensVsPredator.blocks().blockTransformer), new RenderItemTransformer());
        registerItemRenderer(Item.getItemFromBlock(AliensVsPredator.blocks().blockNegativeTransformer), new RenderItemTransformer());
        registerItemRenderer(Item.getItemFromBlock(AliensVsPredator.blocks().redstoneFluxGenerator), new RenderItemRedstoneFluxGenerator());
        registerItemRenderer(Item.getItemFromBlock(AliensVsPredator.blocks().blockAmpule), new RenderItemAmpule());
        registerItemRenderer(Item.getItemFromBlock(AliensVsPredator.blocks().blockLocker), new RenderItemLocker());
        registerItemRenderer(Item.getItemFromBlock(AliensVsPredator.blocks().blockGunLocker), new RenderItemGunLocker());
        registerItemRenderer(Item.getItemFromBlock(AliensVsPredator.blocks().blockMedpod), new RenderItemMedpod());
        registerItemRenderer(Item.getItemFromBlock(AliensVsPredator.blocks().blockSatelliteDish), new RenderItemSatelliteDish());
        registerItemRenderer(items.itemWristbracer, new RenderItemWristbracer());
        registerItemRenderer(items.itemWristbracerBlades, new RenderItemWristbracerBlades());
        registerItemRenderer(items.itemPlasmaCannon, new RenderItemPlasmaCannon());
        registerItemRenderer(items.itemSpear, new RenderItemSpear());
        registerItemRenderer(items.itemM240ICU, new RenderItemM240ICU());
        registerItemRenderer(items.itemNostromoFlamethrower, new RenderItemNostromoFlamethrower());
        registerItemRenderer(items.itemM41A, new RenderItemM41A());
        registerItemRenderer(items.itemM56SG, new RenderItemM56SG());
        registerItemRenderer(items.itemAK47, new RenderItemAK47());
        registerItemRenderer(items.itemM4, new RenderItemM4());
        registerItemRenderer(items.itemPistol, new RenderItem88MOD4());
        registerItemRenderer(items.itemSniper, new RenderItemSniper());
        registerItemRenderer(items.itemMotionTracker, new RenderItemMotionTracker());
        registerItemRenderer(items.itemAPC, new RenderItemAPC());
        registerItemRenderer(items.itemGrenade, new RenderItemM40(AliensVsPredator.resources().models().M40GRENADE));
        registerItemRenderer(items.itemIncendiaryGrenade, new RenderItemM40(AliensVsPredator.resources().models().M40GRENADE_INCENDIARY));

        registerItemRenderer(Item.getItemFromBlock(AliensVsPredator.blocks().supplyCrate), new RenderItemSupplyCrate());
        registerItemRenderer(Item.getItemFromBlock(AliensVsPredator.blocks().supplyCrateMarines), new RenderItemSupplyCrate());
        registerItemRenderer(Item.getItemFromBlock(AliensVsPredator.blocks().supplyCrateSeegson), new RenderItemSupplyCrate());
        registerItemRenderer(items.itemSupplyChute, new RenderItemSupplyChute());
        registerItemRenderer(items.itemSupplyChuteMarines, new RenderItemSupplyChute());
        registerItemRenderer(items.itemSupplyChuteSeegson, new RenderItemSupplyChute());

        Summoners summoners = items.summoners;

        registerItemRenderer(summoners.itemSummonerDrone, (new RenderItemSummoner(AliensVsPredator.resources().models().DRONE_ADVANCED)).setScale(7.5F).setY(6F));
        registerItemRenderer(summoners.itemSummonerProtomorph, (new RenderItemSummoner(AliensVsPredator.resources().models().PROTOMORPH)).setScale(16F).setY(0F));
        registerItemRenderer(summoners.itemSummonerWarrior, (new RenderItemSummoner(AliensVsPredator.resources().models().WARRIOR)).setScale(7.5F).setY(9F));
        registerItemRenderer(summoners.itemSummonerRunnerDrone, (new RenderItemSummoner(AliensVsPredator.resources().models().RUNNER_DRONE)).setScale(7.5F).setY(6F));
        registerItemRenderer(summoners.itemSummonerRunnerWarrior, (new RenderItemSummoner(AliensVsPredator.resources().models().RUNNER_WARRIOR)).setScale(7.5F).setY(9F));
        registerItemRenderer(summoners.itemSummonerPraetorian, (new RenderItemSummoner(AliensVsPredator.resources().models().PRAETORIAN)).setScale(7.5F).setY(7.5F));
        registerItemRenderer(summoners.itemSummonerSpitter, (new RenderItemSummoner(AliensVsPredator.resources().models().SPITTER)).setScale(7.5F).setY(9F));
        registerItemRenderer(summoners.itemSummonerCrusher, (new RenderItemSummoner(AliensVsPredator.resources().models().CRUSHER)).setScale(7.5F).setY(9.5F));
        registerItemRenderer(summoners.itemSummonerQueen, (new RenderItemSummoner(AliensVsPredator.resources().models().XENOQUEEN)).setScale(7.5F).setY(8F));
        registerItemRenderer(summoners.itemSummonerOvamorph, (new RenderItemSummoner(AliensVsPredator.resources().models().OVAMORPH)).setScale(20F).setY(-26F));
        registerItemRenderer(summoners.itemSummonerChestburster, (new RenderItemSummoner(AliensVsPredator.resources().models().CHESTBUSTER)).setScale(9F).setY(1F));
        registerItemRenderer(summoners.itemSummonerFacehugger, (new RenderItemSummoner(AliensVsPredator.resources().models().FACEHUGGER)).setScale(15F).setY(-18F));
        registerItemRenderer(summoners.itemSummonerRoyalFacehugger, (new RenderItemSummoner(AliensVsPredator.resources().models().ROYALFACEHUGGER)).setScale(15F).setY(-16F));
        registerItemRenderer(summoners.itemSummonerMarine, (new RenderItemSummoner(AliensVsPredator.resources().models().MARINE)).setScale(10F).setY(3F));
        registerItemRenderer(summoners.itemSummonerYautja, (new RenderItemSummoner(AliensVsPredator.resources().models().YAUTJA)).setScale(7.5F).setY(8F));
        registerItemRenderer(summoners.itemSummonerPredalien, (new RenderItemSummoner(AliensVsPredator.resources().models().PREDALIEN)).setScale(8F).setY(6F));
        registerItemRenderer(summoners.itemSummonerAqua, (new RenderItemSummoner(AliensVsPredator.resources().models().AQUA_XENOMORPH)).setScale(7.5F).setY(8F));
        registerItemRenderer(summoners.itemSummonerCombatSynthetic, (new RenderItemSummoner(AliensVsPredator.resources().models().COMBAT_SYNTHETIC)).setScale(16F).setY(-12F));
        registerItemRenderer(summoners.itemSummonerHammerpede, (new RenderItemSummoner(AliensVsPredator.resources().models().HAMMERPEDE)).setScale(10.5F).setY(-4F));
        registerItemRenderer(summoners.itemSummonerTrilobite, (new RenderItemSummoner(AliensVsPredator.resources().models().TRILOBITE)).setScale(8F).setY(4F));
        registerItemRenderer(summoners.itemSummonerSpaceJockey, (new RenderItemSummoner(AliensVsPredator.resources().models().SPACE_JOCKEY)).setScale(10F).setY(0F));
        registerItemRenderer(summoners.itemSummonerEngineer, (new RenderItemSummoner(AliensVsPredator.resources().models().ENGINEER)).setScale(10F).setY(0F));
        registerItemRenderer(summoners.itemSummonerYautjaBerserker, (new RenderItemSummoner(AliensVsPredator.resources().models().YAUTJA_BERSERKER)).setScale(7.5F).setY(8F));
        registerItemRenderer(summoners.itemSummonerDeaconShark, (new RenderItemSummoner(AliensVsPredator.resources().models().DEACON_SHARK)).setScale(7.5F).setY(8F));
        registerItemRenderer(summoners.itemSummonerUltramorph, (new RenderItemSummoner(AliensVsPredator.resources().models().ULTRAMORPH)).setScale(7.5F).setY(6F));
        registerItemRenderer(summoners.itemSummonerGooMutant, (new RenderItemSummoner(AliensVsPredator.resources().models().GOO_MUTANT)).setScale(10F).setY(3F));
        registerItemRenderer(summoners.itemSummonerAethon, (new RenderItemSummoner(AliensVsPredator.resources().models().AETHON)).setScale(7.5F).setY(6F));
        registerItemRenderer(summoners.itemSummonerOctohugger, (new RenderItemSummoner(AliensVsPredator.resources().models().OCTOHUGGER)).setScale(24F).setY(-10F));
        registerItemRenderer(summoners.itemSummonerBelugaburster, (new RenderItemSummoner(AliensVsPredator.resources().models().BELUGABURSTER)).setScale(9F).setY(1F));
        registerItemRenderer(summoners.itemSummonerBelugamorph, (new RenderItemSummoner(AliensVsPredator.resources().models().BELUGAMORPH)).setScale(7.5F).setY(6F));
        registerItemRenderer(summoners.itemSummonerPredalienChestburster, (new RenderItemSummoner(AliensVsPredator.resources().models().CHESTBUSTER_PREDALIEN)).setScale(9F).setY(1F));
        registerItemRenderer(summoners.itemSummonerQueenChestburster, (new RenderItemSummoner(AliensVsPredator.resources().models().CHESTBUSTER_QUEEN)).setScale(9F).setY(1F));
        registerItemRenderer(summoners.itemSummonerRunnerChestburster, (new RenderItemSummoner(AliensVsPredator.resources().models().CHESTBUSTER_RUNNER)).setScale(9F).setY(1F));
        registerItemRenderer(summoners.itemSummonerBabyhead, (new RenderItemSummoner(AliensVsPredator.resources().models().BABYHEAD)).setScale(9F).setY(1F));
        registerItemRenderer(summoners.itemSummonerBatXeno, (new RenderItemSummoner(AliensVsPredator.resources().models().BAT_XENO)).setScale(7.5F).setY(1F));
        registerItemRenderer(summoners.itemSummonerBoiler, (new RenderItemSummoner(AliensVsPredator.resources().models().BOILER)).setScale(9F).setY(1F));
        registerItemRenderer(summoners.itemSummonerDracoburster, (new RenderItemSummoner(AliensVsPredator.resources().models().DRACOBURSTER)).setScale(7.5F).setY(2F).setX(-3F));
        registerItemRenderer(summoners.itemSummonerDracoEgg, (new RenderItemSummoner(AliensVsPredator.resources().models().DRACO_OVAMORPH)).setScale(20F).setY(-26F));
        registerItemRenderer(summoners.itemSummonerDracomorph, (new RenderItemSummoner(AliensVsPredator.resources().models().DRACOMORPH)).setScale(6F).setY(10F).setX(-3F));
        registerItemRenderer(summoners.itemSummonerMyceliomorph, (new RenderItemSummoner(AliensVsPredator.resources().models().MYCELIOMORPH)).setScale(9F).setY(1F).setX(-3F));
        registerItemRenderer(summoners.itemSummonerPantheramorph, (new RenderItemSummoner(AliensVsPredator.resources().models().PANTHERAMORPH)).setScale(7.5F).setY(2F).setX(-3F));
        registerItemRenderer(summoners.itemSummonerPredatorHound, (new RenderItemSummoner(AliensVsPredator.resources().models().PREDATOR_HOUND)).setScale(12F).setY(-10F));
        registerItemRenderer(summoners.itemSummonerUrsuidae, (new RenderItemSummoner(AliensVsPredator.resources().models().URSUIDAE)).setScale(14F).setY(-12F));
        registerItemRenderer(summoners.itemSummonerVardaMonkey, (new RenderItemSummoner(AliensVsPredator.resources().models().VARDA_MONKEY)).setScale(16F).setY(-14F));
        registerItemRenderer(summoners.itemSummonerYautjaMutant, (new RenderItemSummoner(AliensVsPredator.resources().models().MUTANT_YAUTJA)).setScale(9F).setY(1F));

        TexturedModel<Model88MOD4> _88MOD4 = AliensVsPredator.resources().models()._88MOD4;
        registerItemRenderer(items.itemPistolBarrel, new RenderItem88Mod4Barrel(_88MOD4, _88MOD4.getModel().getBarrel()));
        registerItemRenderer(items.itemPistolAction, new RenderItem88Mod4Action(_88MOD4, _88MOD4.getModel().getAction()));
        registerItemRenderer(items.itemPistolStock, new RenderItem88Mod4Stock(_88MOD4, _88MOD4.getModel().getStock()));

        TexturedModel<ModelAK47> AK47 = AliensVsPredator.resources().models().AK47;
        registerItemRenderer(items.itemAK47Barrel, new RenderItemAK47Barrel(AK47, AK47.getModel().getBarrel()));
        registerItemRenderer(items.itemAK47Action, new RenderItemAK47Action(AK47, AK47.getModel().getAction()));
        registerItemRenderer(items.itemAK47Stock, new RenderItemAK47Stock(AK47, AK47.getModel().getStock()));

        TexturedModel<ModelM4> M4 = AliensVsPredator.resources().models().M4;
        registerItemRenderer(items.itemM4Barrel, new RenderItemM4Barrel(M4, M4.getModel().getBarrel()));
        registerItemRenderer(items.itemM4Action, new RenderItemM4Action(M4, M4.getModel().getAction()));
        registerItemRenderer(items.itemM4Stock, new RenderItemM4Stock(M4, M4.getModel().getStock()));

        TexturedModel<ModelM56SG> M56SG = AliensVsPredator.resources().models().M56SG;
        registerItemRenderer(items.itemM56SGAction, new RenderItemM56SGAction(M56SG, M56SG.getModel().getAction()));
        registerItemRenderer(items.itemM56SGAimingModule, new RenderItemM56SGAimingModule(M56SG, M56SG.getModel().getAccessories()));
        registerItemRenderer(items.itemM56SGBarrel, new RenderItemM56SGBarrel(M56SG, M56SG.getModel().getBarrel()));
        registerItemRenderer(items.itemM56SGStock, new RenderItemM56SGStock(M56SG, M56SG.getModel().getStock()));
        registerItemRenderer(items.itemM56SGSupportFrame, new RenderItemM56SGSupportFrame(M56SG, M56SG.getModel().getPeripherals()));

        TexturedModel<ModelM41A> M41A = AliensVsPredator.resources().models().M41A;
        registerItemRenderer(items.itemM41AAction, new RenderItemM41AAction(M41A, M41A.getModel().getAction()));
        registerItemRenderer(items.itemM41ABarrel, new RenderItemM41ABarrel(M41A, M41A.getModel().getBarrel()));
        registerItemRenderer(items.itemM41AStock, new RenderItemM41AStock(M41A, M41A.getModel().getStock()));
        registerItemRenderer(items.itemM41APeripherals, new RenderItemM41APeripherals(M41A, M41A.getModel().getPeripherals()));

        TexturedModel<ModelSniper> SNIPER = AliensVsPredator.resources().models().SNIPER;
        registerItemRenderer(items.itemSniperBarrel, new RenderItemSniperBarrel(SNIPER, SNIPER.getModel().getBarrel()));
        registerItemRenderer(items.itemSniperAction, new RenderItemSniperAction(SNIPER, SNIPER.getModel().getAction()));
        registerItemRenderer(items.itemSniperScope, new RenderItemSniperScope(SNIPER, SNIPER.getModel().getScope()));
        registerItemRenderer(items.itemSniperStock, new RenderItemSniperStock(SNIPER, SNIPER.getModel().getStock()));
        registerItemRenderer(items.itemSniperPeripherals, new RenderItemSniperPeripherals(SNIPER, SNIPER.getModel().getPeripherals()));
    }

    private void registerTileEntitySpecialRenderers()
    {
        bindTileEntitySpecialRenderer(TileEntityTurret.class, new RenderTurret());
        bindTileEntitySpecialRenderer(TileEntityWorkstation.class, new RenderWorkstation());
        bindTileEntitySpecialRenderer(TileEntityStasisMechanism.class, new RenderStasisMechanism());
        bindTileEntitySpecialRenderer(TileEntityPowerline.class, new RenderPowerline());
        bindTileEntitySpecialRenderer(TileEntityBlastdoor.class, new RenderBlastdoor());
        bindTileEntitySpecialRenderer(TileEntityCryostasisTube.class, new RenderCryostasisTube());
        bindTileEntitySpecialRenderer(TileEntityRepulsionGenerator.class, new RenderRepulsionGenerator());
        bindTileEntitySpecialRenderer(TileEntityAssembler.class, new RenderAssembler());
        bindTileEntitySpecialRenderer(TileEntityLightPanel.class, new RenderLightPanel());
        bindTileEntitySpecialRenderer(TileEntitySolarPanel.class, new RenderSolarPanel());
        bindTileEntitySpecialRenderer(TileEntitySatelliteModem.class, new RenderSatelliteModem());
        bindTileEntitySpecialRenderer(TileEntityTransformer.class, new RenderTransformer());
        bindTileEntitySpecialRenderer(TileEntityNegativeTransformer.class, new RenderTransformer());
        bindTileEntitySpecialRenderer(TileEntityRedstoneSensor.class, new RenderRedstoneSensor());
        bindTileEntitySpecialRenderer(TileEntityRedstoneEmitter.class, new RenderRedstoneEmitter());
        bindTileEntitySpecialRenderer(TileEntityRedstoneFluxGenerator.class, new RenderRedstoneFluxGenerator());
        bindTileEntitySpecialRenderer(TileEntityPowercell.class, new RenderPowercell());
        bindTileEntitySpecialRenderer(TileEntityAmpule.class, new RenderAmpule());
        bindTileEntitySpecialRenderer(TileEntityLocker.class, new RenderLocker());
        bindTileEntitySpecialRenderer(TileEntityGunLocker.class, new RenderGunLocker());
        bindTileEntitySpecialRenderer(TileEntityMedpod.class, new RenderMedpod());
        bindTileEntitySpecialRenderer(TileEntitySatelliteDish.class, new RenderSatelliteDish());
        bindTileEntitySpecialRenderer(TileEntitySupplyCrate.class, new RenderSupplyCrate());
        bindTileEntitySpecialRenderer(TileEntityHiveResin.class, new RenderHiveResin());
        bindTileEntitySpecialRenderer(TileEntitySkull.class, new RenderSkull());
    }

    private void registerSimpleBlockRenderingHandlers()
    {
        registerBlockHandler(new RenderShape(AliensVsPredator.renderTypes().RENDER_TYPE_SHAPED));
        registerBlockHandler(new RenderResin(AliensVsPredator.renderTypes().RENDER_TYPE_RESIN));
    }
}
