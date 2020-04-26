//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.matez.wildnature.entity.render.cape;

import com.matez.wildnature.Main;
import com.matez.wildnature.customizable.CommonConfig;
import com.matez.wildnature.event.ClientPlayerEventHandler;
import com.matez.wildnature.event.PlayerEventHandler;
import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.model.PlayerModel;
import net.minecraft.entity.player.PlayerModelPart;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class WNCapeLayer extends LayerRenderer<AbstractClientPlayerEntity, PlayerModel<AbstractClientPlayerEntity>> {
    public WNCapeLayer(IEntityRenderer<AbstractClientPlayerEntity, PlayerModel<AbstractClientPlayerEntity>> p_i50950_1_) {
        super(p_i50950_1_);
    }

    public void render(AbstractClientPlayerEntity entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        ResourceLocation rl = PlayerEventHandler.getCapeResourceLocation(entitylivingbaseIn);
        if (entitylivingbaseIn.hasPlayerInfo() && !entitylivingbaseIn.isInvisible() && entitylivingbaseIn.isWearing(PlayerModelPart.CAPE) && rl != null) {
            ItemStack itemstack = entitylivingbaseIn.getItemStackFromSlot(EquipmentSlotType.CHEST);
            if (itemstack.getItem() != Items.ELYTRA) {
                float capeFloat = 0.125F;
                float capeHeight = 0.0F;
                if (entitylivingbaseIn.shouldRenderSneaking()) {
                    if (entitylivingbaseIn.getItemStackFromSlot(EquipmentSlotType.CHEST).getItem() instanceof ArmorItem) {
                        capeFloat -= 0.1F;
                        capeHeight -= 0.05F;
                    } else {
                        capeFloat -= 0.1F;
                        capeHeight += 0.05F;
                    }
                }

                GlStateManager.color4f(1.0F, 1.0F, 1.0F, 1.0F);
                this.bindTexture(rl);
                GlStateManager.pushMatrix();
                GlStateManager.translatef(0.0F, capeHeight, capeFloat);
                double d0 = MathHelper.lerp((double)partialTicks, entitylivingbaseIn.prevChasingPosX, entitylivingbaseIn.chasingPosX) - MathHelper.lerp((double)partialTicks, entitylivingbaseIn.prevPosX, entitylivingbaseIn.posX);
                double d1 = MathHelper.lerp((double)partialTicks, entitylivingbaseIn.prevChasingPosY, entitylivingbaseIn.chasingPosY) - MathHelper.lerp((double)partialTicks, entitylivingbaseIn.prevPosY, entitylivingbaseIn.posY);
                double d2 = MathHelper.lerp((double)partialTicks, entitylivingbaseIn.prevChasingPosZ, entitylivingbaseIn.chasingPosZ) - MathHelper.lerp((double)partialTicks, entitylivingbaseIn.prevPosZ, entitylivingbaseIn.posZ);
                float f = entitylivingbaseIn.prevRenderYawOffset + (entitylivingbaseIn.renderYawOffset - entitylivingbaseIn.prevRenderYawOffset);
                double d3 = (double)MathHelper.sin(f * 0.017453292F);
                double d4 = (double)(-MathHelper.cos(f * 0.017453292F));
                float f1 = (float)d1 * 10.0F;
                f1 = MathHelper.clamp(f1, -6.0F, 32.0F);
                float f2 = (float)(d0 * d3 + d2 * d4) * 100.0F;
                f2 = MathHelper.clamp(f2, 0.0F, 150.0F);
                float f3 = (float)(d0 * d4 - d2 * d3) * 100.0F;
                f3 = MathHelper.clamp(f3, -20.0F, 20.0F);
                if (f2 < 0.0F) {
                    f2 = 0.0F;
                }

                float f4 = MathHelper.lerp(partialTicks, entitylivingbaseIn.prevCameraYaw, entitylivingbaseIn.cameraYaw);
                f1 += MathHelper.sin(MathHelper.lerp(partialTicks, entitylivingbaseIn.prevDistanceWalkedModified, entitylivingbaseIn.distanceWalkedModified) * 6.0F) * 32.0F * f4;
                if (entitylivingbaseIn.shouldRenderSneaking()) {
                    f1 += 25.0F;
                }

                GlStateManager.rotatef(6.0F + f2 / 2.0F + f1, 1.0F, 0.0F, 0.0F);
                GlStateManager.rotatef(f3 / 2.0F, 0.0F, 0.0F, 1.0F);
                GlStateManager.rotatef(-f3 / 2.0F, 0.0F, 1.0F, 0.0F);
                GlStateManager.rotatef(180.0F, 0.0F, 1.0F, 0.0F);
                ((PlayerModel)this.getEntityModel()).renderCape(0.0625F);
                GlStateManager.popMatrix();
            }
        }

    }

    @Override
    public boolean shouldCombineTextures() {
        return false;
    }

}
