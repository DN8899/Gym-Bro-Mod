package net.derrick.tutorialmod.hud;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerEntity;

public class StaminaBarRenderer extends InGameHud {
    private final MinecraftClient client;
    private ItemRenderer itemRenderer;

    public StaminaBarRenderer(MinecraftClient client, ItemRenderer itemRenderer) {
        super(client, itemRenderer);
        this.client = client;
        this.itemRenderer = itemRenderer;
    }



    @Override
    public void render(DrawContext context, float tickDelta) {
        MatrixStack matrices = RenderSystem.getModelViewStack();

        PlayerEntity player = client.player;

        if (player != null) {
            int screenWidth = client.getWindow().getScaledWidth();
            int screenHeight = client.getWindow().getScaledHeight();

            int staminaBarWidth = 100;
            int staminaBarHeight = 10;

            int stamina =
        }
    }
}
