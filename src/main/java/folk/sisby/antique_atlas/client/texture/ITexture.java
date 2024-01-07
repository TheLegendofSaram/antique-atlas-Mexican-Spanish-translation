package folk.sisby.antique_atlas.client.texture;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

/**
 * A generic interface for textures. The texture know their own width and height.
 * All method parameters are provided in pixels.
 */
public interface ITexture {

    /**
     * Returns path of the texture used for drawing
     *
     * @return the physical path to the image file used as texture
     */
    Identifier getTexture();

    int width();

    int height();

    void bind();

    void draw(DrawContext context, int x, int y);

    void draw(DrawContext context, int x, int y, int width, int height);

    void drawCenteredWithRotation(DrawContext context, int x, int y, int width, int height, float rotation);

    void draw(DrawContext context, int x, int y, int width, int height, int u, int v, int regionWidth, int regionHeight);

    void draw(DrawContext context, int x, int y, int u, int v, int regionWidth, int regionHeight);

    void drawWithLight(VertexConsumerProvider consumer, MatrixStack matrices, int x, int y, int width, int height, int light);

    void drawWithLight(VertexConsumerProvider consumer, MatrixStack matrices, int x, int y, int width, int height, int u, int v, int regionWidth, int regionHeight, int light);
}