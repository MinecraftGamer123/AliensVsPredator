package org.avp.block;

import org.avp.tile.TileEntityNegativeTransformer;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockNegativeTransformer extends BlockTransformer
{
    public BlockNegativeTransformer(Material material)
    {
        super(material);
    }

    @Override
    public TileEntity createTileEntity(World world, IBlockState state)
    {
        return new TileEntityNegativeTransformer();
    }
    
    @Override
    public boolean hasTileEntity(IBlockState state)
    {
        return true;
    }
}
