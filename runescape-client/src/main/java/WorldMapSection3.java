import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("p")
@Implements("WorldMapSection3")
public class WorldMapSection3 implements WorldMapSection {
   @ObfuscatedName("h")
   @Export("osNameLowerCase")
   public static String osNameLowerCase;
   @ObfuscatedName("dr")
   @ObfuscatedSignature(
      signature = "Lit;"
   )
   @Export("archive8")
   static Archive archive8;
   @ObfuscatedName("go")
   @ObfuscatedGetter(
      intValue = -948290091
   )
   static int field1089;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 1389733201
   )
   int field1090;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1622972483
   )
   int field1091;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 702057599
   )
   int field1092;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1068088609
   )
   int field1093;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = 1257151629
   )
   int field1094;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -1351623663
   )
   int field1095;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 1016557381
   )
   int field1096;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 884736611
   )
   int field1097;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 395786901
   )
   int field1098;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -627081155
   )
   int field1099;

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(Lag;I)V",
      garbageValue = "1384899025"
   )
   @Export("expandBounds")
   public void expandBounds(WorldMapArea var1) {
      if (var1.minX0 > this.field1096) {
         var1.minX0 = this.field1096;
      }

      if (var1.maxX0 < this.field1098) {
         var1.maxX0 = this.field1098;
      }

      if (var1.minY0 > this.field1097) {
         var1.minY0 = this.field1097;
      }

      if (var1.maxY0 < this.field1099) {
         var1.maxY0 = this.field1099;
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(IIIB)Z",
      garbageValue = "93"
   )
   @Export("containsCoord")
   public boolean containsCoord(int var1, int var2, int var3) {
      return var1 >= this.field1090 && var1 < this.field1090 + this.field1091 ? var2 >> 6 >= this.field1092 && var2 >> 6 <= this.field1094 && var3 >> 6 >= this.field1093 && var3 >> 6 <= this.field1095 : false;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(IIB)Z",
      garbageValue = "4"
   )
   @Export("containsPosition")
   public boolean containsPosition(int var1, int var2) {
      return var1 >> 6 >= this.field1096 && var1 >> 6 <= this.field1098 && var2 >> 6 >= this.field1097 && var2 >> 6 <= this.field1099;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IIII)[I",
      garbageValue = "1545934424"
   )
   @Export("position")
   public int[] position(int var1, int var2, int var3) {
      if (!this.containsCoord(var1, var2, var3)) {
         return null;
      } else {
         int[] var4 = new int[]{this.field1096 * 64 - this.field1092 * 64 + var2, var3 + (this.field1097 * 64 - this.field1093 * 64)};
         return var4;
      }
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(III)Lhu;",
      garbageValue = "-1916486802"
   )
   @Export("coord")
   public Coord coord(int var1, int var2) {
      if (!this.containsPosition(var1, var2)) {
         return null;
      } else {
         int var3 = this.field1092 * 64 - this.field1096 * 64 + var1;
         int var4 = this.field1093 * 64 - this.field1097 * 64 + var2;
         return new Coord(this.field1090, var3, var4);
      }
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(Lgr;B)V",
      garbageValue = "-113"
   )
   @Export("read")
   public void read(Buffer var1) {
      this.field1090 = var1.readUnsignedByte();
      this.field1091 = var1.readUnsignedByte();
      this.field1092 = var1.readUnsignedShort();
      this.field1093 = var1.readUnsignedShort();
      this.field1094 = var1.readUnsignedShort();
      this.field1095 = var1.readUnsignedShort();
      this.field1096 = var1.readUnsignedShort();
      this.field1097 = var1.readUnsignedShort();
      this.field1098 = var1.readUnsignedShort();
      this.field1099 = var1.readUnsignedShort();
      this.method426();
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-126"
   )
   void method426() {
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(Lho;II)V",
      garbageValue = "1115233428"
   )
   static final void method345(Widget var0, int var1) {
      if (var0.field966 == null) {
         throw new RuntimeException();
      } else {
         if (var0.field984 == null) {
            var0.field984 = new int[var0.field966.length];
         }

         var0.field984[var1] = Integer.MAX_VALUE;
      }
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "23"
   )
   @Export("runWidgetOnLoadListener")
   static void runWidgetOnLoadListener(int var0) {
      if (var0 != -1 && GroundItemPile.loadInterface(var0)) {
         Widget[] var1 = Widget.interfaceComponents[var0];

         for (int var2 = 0; var2 < var1.length; ++var2) {
            Widget var3 = var1[var2];
            if (var3.onLoad != null) {
               ScriptEvent var4 = new ScriptEvent();
               var4.widget = var3;
               var4.args0 = var3.onLoad;
               GrandExchangeEvent.runScript0(var4, 5000000);
            }
         }
      }

   }

   @ObfuscatedName("ic")
   @ObfuscatedSignature(
      signature = "(Lho;IIZB)V",
      garbageValue = "-35"
   )
   @Export("alignWidgetSize")
   static void alignWidgetSize(Widget component, int parentWidth, int parentHeight, boolean var3) {
      int var4 = component.width;
      int var5 = component.height;
      if (component.widthAlignment == 0) {
         component.width = component.rawWidth;
      } else if (component.widthAlignment == 1) {
         component.width = parentWidth - component.rawWidth;
      } else if (component.widthAlignment == 2) {
         component.width = component.rawWidth * parentWidth >> 14;
      }

      if (component.heightAlignment == 0) {
         component.height = component.rawHeight;
      } else if (component.heightAlignment == 1) {
         component.height = parentHeight - component.rawHeight;
      } else if (component.heightAlignment == 2) {
         component.height = parentHeight * component.rawHeight >> 14;
      }

      if (component.widthAlignment == 4) {
         component.width = component.height * component.field958 / component.field959;
      }

      if (component.heightAlignment == 4) {
         component.height = component.width * component.field959 / component.field958;
      }

      if (component.contentType == 1337) {
         Client.viewportWidget = component;
      }

      if (var3 && component.onResize != null && (var4 != component.width || var5 != component.height)) {
         ScriptEvent var6 = new ScriptEvent();
         var6.widget = component;
         var6.args0 = component.onResize;
         Client.scriptEvents.addFirst(var6);
      }

   }
}
