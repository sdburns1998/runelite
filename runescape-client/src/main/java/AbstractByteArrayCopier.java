import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gu")
@Implements("AbstractByteArrayCopier")
public abstract class AbstractByteArrayCopier {
   @ObfuscatedName("f")
   @Export("directBufferUnavailable")
   static boolean directBufferUnavailable;
   @ObfuscatedName("et")
   @ObfuscatedSignature(
      signature = "Lit;"
   )
   static Archive field0;

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(I)[B",
      garbageValue = "-1219910462"
   )
   @Export("get")
   abstract byte[] get();

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "([BI)V",
      garbageValue = "-2034091753"
   )
   @Export("set")
   abstract void set(byte[] array);

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(II)Liw;",
      garbageValue = "1102198559"
   )
   @Export("getVarcInt")
   public static VarcInt getVarcInt(int var0) {
      VarcInt var1 = (VarcInt)VarcInt.cachedVarcInts.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = VarcInt.field942.takeFile(19, var0);
         var1 = new VarcInt();
         if (var2 != null) {
            var1.method354(new Buffer(var2));
         }

         VarcInt.cachedVarcInts.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1941491045"
   )
   @Export("unloadInterface")
   public static void unloadInterface(int var0) {
      if (var0 != -1 && Widget.loadedInterfaces[var0]) {
         Widget.Widget_archive.method7(var0);
         if (Widget.interfaceComponents[var0] != null) {
            boolean var1 = true;

            for (int var2 = 0; var2 < Widget.interfaceComponents[var0].length; ++var2) {
               if (Widget.interfaceComponents[var0][var2] != null) {
                  if (Widget.interfaceComponents[var0][var2].type != 2) {
                     Widget.interfaceComponents[var0][var2] = null;
                  } else {
                     var1 = false;
                  }
               }
            }

            if (var1) {
               Widget.interfaceComponents[var0] = null;
            }

            Widget.loadedInterfaces[var0] = false;
         }
      }

   }

   @ObfuscatedName("gb")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1256278627"
   )
   static void method4024() {
      PacketBufferNode var0 = Interpreter.method1915(ClientPacket.field257, Client.packetWriter.isaacCipher);
      var0.packetBuffer.writeByte(SpotAnimationDefinition.getWindowedMode());
      var0.packetBuffer.writeShort(SoundCache.canvasWidth);
      var0.packetBuffer.writeShort(Huffman.canvasHeight);
      Client.packetWriter.method241(var0);
   }

   static {
      directBufferUnavailable = false;
   }
}
