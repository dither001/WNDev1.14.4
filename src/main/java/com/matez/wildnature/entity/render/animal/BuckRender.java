package com.matez.wildnature.entity.render.animal;

import com.matez.wildnature.Main;
import com.matez.wildnature.entity.model.animal.BuckModel;
import com.matez.wildnature.entity.model.animal.DrakeModel;
import com.matez.wildnature.entity.type.animal.deer.AbstractDeerEntity;
import com.matez.wildnature.entity.type.animal.duck.AbstractDuckEntity;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import javax.annotation.Nullable;

@OnlyIn(Dist.CLIENT)
public class BuckRender extends MobRenderer<AbstractDeerEntity, BuckModel> {
    public BuckRender(EntityRendererManager manager) {
        super(manager, new BuckModel(), 1.2F);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(AbstractDeerEntity entity) {
        return Main.RegistryEvents.location("textures/entity/deer_male.png");
    }

    public static class RenderFactory implements IRenderFactory<AbstractDeerEntity>{
        @Override
        public EntityRenderer<? super AbstractDeerEntity> createRenderFor(EntityRendererManager manager) {
            return new BuckRender(manager);
        }
    }
}
