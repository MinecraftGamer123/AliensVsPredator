package org.avp.client.render.entities.living;

import org.avp.AliensVsPredator;
import org.avp.client.model.entities.living.ModelTrilobite;
import org.avp.entities.living.species.species223ode.EntityTrilobite;

import com.asx.mdx.lib.client.util.OpenGL;
import com.asx.mdx.lib.client.util.entity.RenderLivingWrapper;

import net.minecraft.client.renderer.entity.RenderManager;

public class RenderTrilobite extends RenderLivingWrapper<EntityTrilobite, ModelTrilobite>
{
    public RenderTrilobite(RenderManager m)
    {
        super(m, AliensVsPredator.resources().models().TRILOBITE);
    }

    @Override
    protected void preRenderCallback(EntityTrilobite trilobite, float partialTicks)
    {
        super.preRenderCallback(trilobite, shadowSize);
        float scale = 2.75F;
        OpenGL.scale(scale, scale, scale);
        OpenGL.translate(0F, 0F, 0F);
    }
}
