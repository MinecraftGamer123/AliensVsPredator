package org.avp.world.playermode;

import com.arisux.mdx.lib.client.render.model.Model;
import com.arisux.mdx.lib.client.render.model.MapModelTexture;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.stats.Achievement;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class LevelData
{
    private int level;
    private Achievement achievement;

    @SideOnly(Side.CLIENT)
    private MapModelTexture<? extends Model> modelTexMap;

    public LevelData(int level)
    {
        this(level, null);
    }

    public LevelData(int level, Achievement achievement)
    {
        this.level = level;
        this.achievement = achievement;
    }

    public boolean isPlayerLevelReached(EntityPlayer player)
    {
        return player.experienceLevel >= this.level;
    }

    public boolean isLevelReached(int level)
    {
        return level >= this.level;
    }

    public int getLevel()
    {
        return level;
    }

    public MapModelTexture<? extends Model> getModelTexMap()
    {
        return modelTexMap;
    }

    public Achievement getAchievement()
    {
        return achievement;
    }

    @SideOnly(Side.CLIENT)
    public LevelData setModelTexMap(MapModelTexture<? extends Model> modelTexMap)
    {
        this.modelTexMap = modelTexMap;
        return this;
    }
}
