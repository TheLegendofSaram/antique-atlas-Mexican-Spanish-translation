package folk.sisby.antique_atlas.client.gui;

import com.mojang.blaze3d.systems.RenderSystem;
import folk.sisby.antique_atlas.client.Textures;
import folk.sisby.antique_atlas.client.gui.core.GuiComponentButton;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.text.Text;
import org.lwjgl.opengl.GL11;

import java.util.Collections;

public class GuiPositionButton extends GuiComponentButton {
    private static final int WIDTH = 11;
    private static final int HEIGHT = 11;

    public GuiPositionButton() {
        setSize(WIDTH, HEIGHT);
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float partialTick) {
        if (isEnabled()) {
            RenderSystem.enableBlend();
            RenderSystem.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);

            int x = getGuiX(), y = getGuiY();
            if (isMouseOver) {
                RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
            } else {
                RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 0.5F);
            }

            Textures.BTN_POSITION.draw(context, x, y, WIDTH, HEIGHT);

            RenderSystem.disableBlend();

            if (isMouseOver) {
                drawTooltip(Collections.singletonList(Text.translatable("gui.antique_atlas.followPlayer")), MinecraftClient.getInstance().textRenderer);
            }
        }
    }
}