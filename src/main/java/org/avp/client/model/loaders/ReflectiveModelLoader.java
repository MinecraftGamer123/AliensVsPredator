package org.avp.client.model.loaders;

import java.util.ArrayList;
import java.util.HashMap;

import org.avp.AliensVsPredator;
import org.avp.client.render.block.model.ModelReflectiveShape;

import net.minecraft.client.resources.IResourceManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ICustomModelLoader;
import net.minecraftforge.client.model.IModel;

public class ReflectiveModelLoader implements ICustomModelLoader
{
    public static final ReflectiveModelLoader INSTANCE = new ReflectiveModelLoader();
    private HashMap<String, IModel> models = new HashMap<String, IModel>();
    private ArrayList<String> dummyIDs = new ArrayList<String>();

    public static final ResourceLocation REFLECTION = new ResourceLocation(AliensVsPredator.Properties.ID, "blocks/reflection");

    public ReflectiveModelLoader()
    {
        this.register();
    }

    public void register()
    {
        //Item Model Key: domain:models/item/ID
        models.put("slope", new ModelReflectiveShape(new ResourceLocation(AliensVsPredator.Properties.ID, "block/slope.obj"), REFLECTION));
        models.put("corner", new ModelReflectiveShape(new ResourceLocation(AliensVsPredator.Properties.ID, "block/corner.obj"), REFLECTION));
        models.put("ridge", new ModelReflectiveShape(new ResourceLocation(AliensVsPredator.Properties.ID, "block/ridge.obj"), REFLECTION));
        models.put("pyramid", new ModelReflectiveShape(new ResourceLocation(AliensVsPredator.Properties.ID, "block/pyramid.obj"), REFLECTION));
        models.put("invertedcorner", new ModelReflectiveShape(new ResourceLocation(AliensVsPredator.Properties.ID, "block/invertedcorner.obj"), REFLECTION));
        models.put("invertedridge", new ModelReflectiveShape(new ResourceLocation(AliensVsPredator.Properties.ID, "block/invertedridge.obj"), REFLECTION));
        models.put("invertedpyramid", new ModelReflectiveShape(new ResourceLocation(AliensVsPredator.Properties.ID, "block/invertedpyramid.obj"), REFLECTION));

        for (String id : this.dummyIDs)
        {
            // DUMMY MODEL
            models.put(id, new ModelReflectiveShape(new ResourceLocation(AliensVsPredator.Properties.ID, "block/slope.obj"), REFLECTION));
        }
    }

    public void registerDummy(String name)
    {
        dummyIDs.add(name);
    }

    @Override
    public void onResourceManagerReload(IResourceManager resourceManager)
    {
        models.clear();
        this.register();
    }

    @Override
    public boolean accepts(ResourceLocation modelLocation)
    {
        if (modelLocation.getNamespace().equals(AliensVsPredator.Properties.ID))
        {
            if (models.containsKey(modelLocation.getPath()))
            {
                return true;
            }
        }

        return false;
    }

    @Override
    public IModel loadModel(ResourceLocation modelLocation) throws Exception
    {
        if (models.containsKey(modelLocation.getPath()))
        {
            return models.get(modelLocation.getPath());
        }

        return null;
    }

    public HashMap<String, IModel> getModels()
    {
        return models;
    }
}
