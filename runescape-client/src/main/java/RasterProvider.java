import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ai")
@Implements("RasterProvider")
public final class RasterProvider extends AbstractRasterProvider {
   @ObfuscatedName("m")
   @Export("component0")
   Component component0;
   @ObfuscatedName("f")
   @Export("image")
   Image image;

   RasterProvider(int var1, int var2, Component var3) {
      super.width = var1;
      super.height = var2;
      super.pixels = new int[var2 * var1 + 1];
      DataBufferInt var4 = new DataBufferInt(super.pixels, super.pixels.length);
      DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
      WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(super.width, super.height), var4, (Point)null);
      this.image = new BufferedImage(var5, var6, false, new Hashtable());
      this.setComponent(var3);
      this.apply();
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(Ljava/awt/Component;B)V",
      garbageValue = "63"
   )
   @Export("setComponent")
   final void setComponent(Component var1) {
      this.component0 = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-430495007"
   )
   @Export("drawFull")
   public final void drawFull(int x, int y) {
      this.drawFull0(this.component0.getGraphics(), x, y);
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(IIIIB)V",
      garbageValue = "18"
   )
   @Export("draw")
   public final void draw(int x, int y, int width, int height) {
      this.draw0(this.component0.getGraphics(), x, y, width, height);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Ljava/awt/Graphics;III)V",
      garbageValue = "-2102440865"
   )
   @Export("drawFull0")
   final void drawFull0(Graphics graphics, int x, int y) {
      try {
         graphics.drawImage(this.image, x, y, this.component0);
      } catch (Exception var5) {
         this.component0.repaint();
      }

   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(Ljava/awt/Graphics;IIIIB)V",
      garbageValue = "3"
   )
   @Export("draw0")
   final void draw0(Graphics graphics, int x, int y, int width, int height) {
      try {
         Shape var6 = graphics.getClip();
         graphics.clipRect(x, y, width, height);
         graphics.drawImage(this.image, 0, 0, this.component0);
         graphics.setClip(var6);
      } catch (Exception var7) {
         this.component0.repaint();
      }

   }
}
