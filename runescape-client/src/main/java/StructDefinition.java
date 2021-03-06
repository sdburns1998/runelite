import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jq")
@Implements("StructDefinition")
public class StructDefinition extends DualNode {
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Lir;"
   )
   @Export("StructDefinition_archive")
   public static AbstractArchive StructDefinition_archive;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Ler;"
   )
   @Export("StructDefinition_cached")
   public static EvictingDualNodeHashTable StructDefinition_cached;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Llh;"
   )
   @Export("params")
   IterableNodeHashTable params;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-16"
   )
   @Export("postDecode")
   void postDecode() {
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Lgr;I)V",
      garbageValue = "853330780"
   )
   @Export("decode")
   void decode(Buffer var1) {
      while (true) {
         int var2 = var1.readUnsignedByte();
         if (var2 == 0) {
            return;
         }

         this.decodeNext(var1, var2);
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgr;II)V",
      garbageValue = "-2035893488"
   )
   @Export("decodeNext")
   void decodeNext(Buffer var1, int var2) {
      if (var2 == 249) {
         this.params = AbstractArchive.readStringIntParameters(var1, this.params);
      }

   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(IIB)I",
      garbageValue = "-30"
   )
   @Export("getIntParam")
   public int getIntParam(int var1, int var2) {
      IterableNodeHashTable var3 = this.params;
      int var4;
      if (var3 == null) {
         var4 = var2;
      } else {
         IntegerNode var5 = (IntegerNode)var3.get((long)var1);
         if (var5 == null) {
            var4 = var2;
         } else {
            var4 = var5.integer;
         }
      }

      return var4;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;I)Ljava/lang/String;",
      garbageValue = "-343626362"
   )
   @Export("getStringParam")
   public String getStringParam(int var1, String var2) {
      return Frames.method3238(this.params, var1, var2);
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(ILcg;ZI)I",
      garbageValue = "2127224103"
   )
   static int method4952(int var0, Script var1, boolean var2) {
      int var3 = -1;
      Widget var4;
      if (var0 >= 2000) {
         var0 -= 1000;
         var3 = Interpreter.Interpreter_intStack[--RouteStrategy.Interpreter_intStackSize];
         var4 = Huffman.getWidget(var3);
      } else {
         var4 = var2 ? WorldMapIcon1.field1030 : GrandExchangeOfferAgeComparator.field1111;
      }

      if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) {
         RouteStrategy.Interpreter_intStackSize -= 2;
         var4.scrollX = Interpreter.Interpreter_intStack[RouteStrategy.Interpreter_intStackSize];
         if (var4.scrollX > var4.scrollWidth - var4.width) {
            var4.scrollX = var4.scrollWidth - var4.width;
         }

         if (var4.scrollX < 0) {
            var4.scrollX = 0;
         }

         var4.scrollY = Interpreter.Interpreter_intStack[RouteStrategy.Interpreter_intStackSize + 1];
         if (var4.scrollY > var4.scrollHeight - var4.height) {
            var4.scrollY = var4.scrollHeight - var4.height;
         }

         if (var4.scrollY < 0) {
            var4.scrollY = 0;
         }

         class22.method295(var4);
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETCOLOUR) {
         var4.color = Interpreter.Interpreter_intStack[--RouteStrategy.Interpreter_intStackSize];
         class22.method295(var4);
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETFILL) {
         var4.fill = Interpreter.Interpreter_intStack[--RouteStrategy.Interpreter_intStackSize] == 1;
         class22.method295(var4);
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETTRANS) {
         var4.transparency = Interpreter.Interpreter_intStack[--RouteStrategy.Interpreter_intStackSize];
         class22.method295(var4);
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETLINEWID) {
         var4.lineWid = Interpreter.Interpreter_intStack[--RouteStrategy.Interpreter_intStackSize];
         class22.method295(var4);
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) {
         var4.spriteId2 = Interpreter.Interpreter_intStack[--RouteStrategy.Interpreter_intStackSize];
         class22.method295(var4);
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SET2DANGLE) {
         var4.spriteAngle = Interpreter.Interpreter_intStack[--RouteStrategy.Interpreter_intStackSize];
         class22.method295(var4);
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETTILING) {
         var4.spriteTiling = Interpreter.Interpreter_intStack[--RouteStrategy.Interpreter_intStackSize] == 1;
         class22.method295(var4);
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETMODEL) {
         var4.modelType = 1;
         var4.modelId = Interpreter.Interpreter_intStack[--RouteStrategy.Interpreter_intStackSize];
         class22.method295(var4);
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) {
         RouteStrategy.Interpreter_intStackSize -= 6;
         var4.modelOffsetX = Interpreter.Interpreter_intStack[RouteStrategy.Interpreter_intStackSize];
         var4.modelOffsetY = Interpreter.Interpreter_intStack[RouteStrategy.Interpreter_intStackSize + 1];
         var4.modelAngleX = Interpreter.Interpreter_intStack[RouteStrategy.Interpreter_intStackSize + 2];
         var4.modelAngleY = Interpreter.Interpreter_intStack[RouteStrategy.Interpreter_intStackSize + 3];
         var4.modelAngleZ = Interpreter.Interpreter_intStack[RouteStrategy.Interpreter_intStackSize + 4];
         var4.modelZoom = Interpreter.Interpreter_intStack[RouteStrategy.Interpreter_intStackSize + 5];
         class22.method295(var4);
         return 1;
      } else {
         int var5;
         if (var0 == ScriptOpcodes.CC_SETMODELANIM) {
            var5 = Interpreter.Interpreter_intStack[--RouteStrategy.Interpreter_intStackSize];
            if (var5 != var4.sequenceId) {
               var4.sequenceId = var5;
               var4.modelFrame = 0;
               var4.modelFrameCycle = 0;
               class22.method295(var4);
            }

            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) {
            var4.modelOrthog = Interpreter.Interpreter_intStack[--RouteStrategy.Interpreter_intStackSize] == 1;
            class22.method295(var4);
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETTEXT) {
            String var8 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
            if (!var8.equals(var4.text)) {
               var4.text = var8;
               class22.method295(var4);
            }

            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETTEXTFONT) {
            var4.fontId = Interpreter.Interpreter_intStack[--RouteStrategy.Interpreter_intStackSize];
            class22.method295(var4);
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) {
            RouteStrategy.Interpreter_intStackSize -= 3;
            var4.textXAlignment = Interpreter.Interpreter_intStack[RouteStrategy.Interpreter_intStackSize];
            var4.textYAlignment = Interpreter.Interpreter_intStack[RouteStrategy.Interpreter_intStackSize + 1];
            var4.textLineHeight = Interpreter.Interpreter_intStack[RouteStrategy.Interpreter_intStackSize + 2];
            class22.method295(var4);
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) {
            var4.textShadowed = Interpreter.Interpreter_intStack[--RouteStrategy.Interpreter_intStackSize] == 1;
            class22.method295(var4);
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETOUTLINE) {
            var4.outline = Interpreter.Interpreter_intStack[--RouteStrategy.Interpreter_intStackSize];
            class22.method295(var4);
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) {
            var4.spriteShadow = Interpreter.Interpreter_intStack[--RouteStrategy.Interpreter_intStackSize];
            class22.method295(var4);
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETVFLIP) {
            var4.spriteFlipV = Interpreter.Interpreter_intStack[--RouteStrategy.Interpreter_intStackSize] == 1;
            class22.method295(var4);
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETHFLIP) {
            var4.spriteFlipH = Interpreter.Interpreter_intStack[--RouteStrategy.Interpreter_intStackSize] == 1;
            class22.method295(var4);
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) {
            RouteStrategy.Interpreter_intStackSize -= 2;
            var4.scrollWidth = Interpreter.Interpreter_intStack[RouteStrategy.Interpreter_intStackSize];
            var4.scrollHeight = Interpreter.Interpreter_intStack[RouteStrategy.Interpreter_intStackSize + 1];
            class22.method295(var4);
            if (var3 != -1 && var4.type == 0) {
               class39.revalidateWidgetScroll(Widget.interfaceComponents[var3 >> 16], var4, false);
            }

            return 1;
         } else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) {
            TilePaint.method3060(var4.id, var4.childIndex);
            Client.field127 = var4;
            class22.method295(var4);
            return 1;
         } else if (var0 == 1122) {
            var4.spriteId = Interpreter.Interpreter_intStack[--RouteStrategy.Interpreter_intStackSize];
            class22.method295(var4);
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) {
            var4.color2 = Interpreter.Interpreter_intStack[--RouteStrategy.Interpreter_intStackSize];
            class22.method295(var4);
            return 1;
         } else if (var0 == 1124) {
            var4.field960 = Interpreter.Interpreter_intStack[--RouteStrategy.Interpreter_intStackSize];
            class22.method295(var4);
            return 1;
         } else if (var0 == 1125) {
            var5 = Interpreter.Interpreter_intStack[--RouteStrategy.Interpreter_intStackSize];
            RectangleMode var7 = (RectangleMode)ScriptFrame.findEnumerated(DefaultsGroup.method5822(), var5);
            if (var7 != null) {
               var4.rectangleMode = var7;
               class22.method295(var4);
            }

            return 1;
         } else {
            boolean var6;
            if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) {
               var6 = Interpreter.Interpreter_intStack[--RouteStrategy.Interpreter_intStackSize] == 1;
               var4.field961 = var6;
               return 1;
            } else if (var0 == 1127) {
               var6 = Interpreter.Interpreter_intStack[--RouteStrategy.Interpreter_intStackSize] == 1;
               var4.modelTransparency = var6;
               return 1;
            } else {
               return 2;
            }
         }
      }
   }

   static {
      StructDefinition_cached = new EvictingDualNodeHashTable(64);
   }
}
