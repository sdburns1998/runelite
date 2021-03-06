import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bz")
@Implements("Actor")
public abstract class Actor extends Entity {
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -1573449469
   )
   @Export("x")
   int x;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = 676600595
   )
   @Export("y")
   int y;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 1439711403
   )
   int field9;
   @ObfuscatedName("ay")
   boolean field10;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = -1357622739
   )
   @Export("size")
   int size;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = 141226463
   )
   @Export("playerCycle")
   int playerCycle;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -299122235
   )
   @Export("readySequence")
   int readySequence;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -831787909
   )
   @Export("turnLeftSequence")
   int turnLeftSequence;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 1788714977
   )
   @Export("turnRightSequence")
   int turnRightSequence;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = -2075997699
   )
   @Export("walkSequence")
   int walkSequence;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -1598871111
   )
   @Export("walkBackSequence")
   int walkBackSequence;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = -568830521
   )
   @Export("walkLeftSequence")
   int walkLeftSequence;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -257240117
   )
   @Export("walkRightSequence")
   int walkRightSequence;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 1708570917
   )
   @Export("runSequence")
   int runSequence;
   @ObfuscatedName("am")
   @Export("overheadText")
   String overheadText;
   @ObfuscatedName("an")
   @Export("isAutoChatting")
   boolean isAutoChatting;
   @ObfuscatedName("az")
   boolean field11;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 137508815
   )
   @Export("overheadTextCyclesRemaining")
   int overheadTextCyclesRemaining;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -1905191799
   )
   @Export("overheadTextColor")
   int overheadTextColor;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = 541000549
   )
   @Export("overheadTextEffect")
   int overheadTextEffect;
   @ObfuscatedName("af")
   @Export("hitSplatCount")
   byte hitSplatCount;
   @ObfuscatedName("ai")
   @Export("hitSplatTypes")
   int[] hitSplatTypes;
   @ObfuscatedName("ba")
   @Export("hitSplatValues")
   int[] hitSplatValues;
   @ObfuscatedName("bb")
   @Export("hitSplatCycles")
   int[] hitSplatCycles;
   @ObfuscatedName("bs")
   @Export("hitSplatTypes2")
   int[] hitSplatTypes2;
   @ObfuscatedName("bq")
   @Export("hitSplatValues2")
   int[] hitSplatValues2;
   @ObfuscatedName("bn")
   @ObfuscatedSignature(
      signature = "Lja;"
   )
   @Export("healthBars")
   IterableNodeDeque healthBars;
   @ObfuscatedName("bk")
   @ObfuscatedGetter(
      intValue = -1387109107
   )
   @Export("targetIndex")
   int targetIndex;
   @ObfuscatedName("bd")
   @Export("false0")
   boolean false0;
   @ObfuscatedName("bc")
   @ObfuscatedGetter(
      intValue = 139384875
   )
   int field12;
   @ObfuscatedName("bo")
   @ObfuscatedGetter(
      intValue = 1614854211
   )
   @Export("movementSequence")
   int movementSequence;
   @ObfuscatedName("bx")
   @ObfuscatedGetter(
      intValue = -1119758739
   )
   @Export("movementFrame")
   int movementFrame;
   @ObfuscatedName("by")
   @ObfuscatedGetter(
      intValue = -1646413227
   )
   @Export("movementFrameCycle")
   int movementFrameCycle;
   @ObfuscatedName("bu")
   @ObfuscatedGetter(
      intValue = 323216015
   )
   @Export("sequence")
   int sequence;
   @ObfuscatedName("bm")
   @ObfuscatedGetter(
      intValue = 1425662251
   )
   @Export("sequenceFrame")
   int sequenceFrame;
   @ObfuscatedName("bl")
   @ObfuscatedGetter(
      intValue = -1753867715
   )
   @Export("sequenceFrameCycle")
   int sequenceFrameCycle;
   @ObfuscatedName("br")
   @ObfuscatedGetter(
      intValue = -134491649
   )
   @Export("sequenceDelay")
   int sequenceDelay;
   @ObfuscatedName("bj")
   @ObfuscatedGetter(
      intValue = -1523249259
   )
   int field13;
   @ObfuscatedName("bi")
   @ObfuscatedGetter(
      intValue = -220610999
   )
   @Export("spotAnimation")
   int spotAnimation;
   @ObfuscatedName("bz")
   @ObfuscatedGetter(
      intValue = -2125404733
   )
   @Export("spotAnimationFrame")
   int spotAnimationFrame;
   @ObfuscatedName("bg")
   @ObfuscatedGetter(
      intValue = 330334599
   )
   @Export("spotAnimationFrameCycle")
   int spotAnimationFrameCycle;
   @ObfuscatedName("bt")
   @ObfuscatedGetter(
      intValue = 886371765
   )
   int field14;
   @ObfuscatedName("bp")
   @ObfuscatedGetter(
      intValue = -779457309
   )
   @Export("heightOffset")
   int heightOffset;
   @ObfuscatedName("bf")
   @ObfuscatedGetter(
      intValue = 2121599561
   )
   int field15;
   @ObfuscatedName("bh")
   @ObfuscatedGetter(
      intValue = 280591281
   )
   int field16;
   @ObfuscatedName("be")
   @ObfuscatedGetter(
      intValue = 837989037
   )
   int field17;
   @ObfuscatedName("bv")
   @ObfuscatedGetter(
      intValue = -1857513783
   )
   int field18;
   @ObfuscatedName("bw")
   @ObfuscatedGetter(
      intValue = -1630403001
   )
   int field19;
   @ObfuscatedName("cr")
   @ObfuscatedGetter(
      intValue = 1367256299
   )
   int field20;
   @ObfuscatedName("cv")
   @ObfuscatedGetter(
      intValue = -1723834619
   )
   int field21;
   @ObfuscatedName("ce")
   @ObfuscatedGetter(
      intValue = 2051334073
   )
   @Export("npcCycle")
   int npcCycle;
   @ObfuscatedName("cy")
   @ObfuscatedGetter(
      intValue = 1003085333
   )
   @Export("defaultHeight")
   int defaultHeight;
   @ObfuscatedName("cs")
   @ObfuscatedGetter(
      intValue = -1189634367
   )
   @Export("orientation")
   int orientation;
   @ObfuscatedName("cm")
   @ObfuscatedGetter(
      intValue = 1252341007
   )
   int field22;
   @ObfuscatedName("cj")
   @ObfuscatedGetter(
      intValue = -336931157
   )
   int field23;
   @ObfuscatedName("cu")
   @ObfuscatedGetter(
      intValue = -2033082375
   )
   @Export("pathLength")
   int pathLength;
   @ObfuscatedName("cb")
   @Export("pathX")
   int[] pathX;
   @ObfuscatedName("ck")
   @Export("pathY")
   int[] pathY;
   @ObfuscatedName("cn")
   @Export("pathTraversed")
   byte[] pathTraversed;
   @ObfuscatedName("cq")
   @ObfuscatedGetter(
      intValue = -1583514013
   )
   int field24;
   @ObfuscatedName("ch")
   @ObfuscatedGetter(
      intValue = 1584102533
   )
   int field25;

   Actor() {
      this.field10 = false;
      this.size = 1;
      this.readySequence = -1;
      this.turnLeftSequence = -1;
      this.turnRightSequence = -1;
      this.walkSequence = -1;
      this.walkBackSequence = -1;
      this.walkLeftSequence = -1;
      this.walkRightSequence = -1;
      this.runSequence = -1;
      this.overheadText = null;
      this.field11 = false;
      this.overheadTextCyclesRemaining = 100;
      this.overheadTextColor = 0;
      this.overheadTextEffect = 0;
      this.hitSplatCount = 0;
      this.hitSplatTypes = new int[4];
      this.hitSplatValues = new int[4];
      this.hitSplatCycles = new int[4];
      this.hitSplatTypes2 = new int[4];
      this.hitSplatValues2 = new int[4];
      this.healthBars = new IterableNodeDeque();
      this.targetIndex = -1;
      this.false0 = false;
      this.field12 = -1;
      this.movementSequence = -1;
      this.movementFrame = 0;
      this.movementFrameCycle = 0;
      this.sequence = -1;
      this.sequenceFrame = 0;
      this.sequenceFrameCycle = 0;
      this.sequenceDelay = 0;
      this.field13 = 0;
      this.spotAnimation = -1;
      this.spotAnimationFrame = 0;
      this.spotAnimationFrameCycle = 0;
      this.npcCycle = 0;
      this.defaultHeight = 200;
      this.field22 = 0;
      this.field23 = 32;
      this.pathLength = 0;
      this.pathX = new int[10];
      this.pathY = new int[10];
      this.pathTraversed = new byte[10];
      this.field24 = 0;
      this.field25 = 0;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "1"
   )
   @Export("isVisible")
   boolean isVisible() {
      return false;
   }

   @ObfuscatedName("bb")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1415393262"
   )
   final void method23() {
      this.pathLength = 0;
      this.field25 = 0;
   }

   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      signature = "(IIIIIII)V",
      garbageValue = "-1925126781"
   )
   @Export("addHitSplat")
   final void addHitSplat(int type, int value, int type2, int value2, int cycle, int cycle2) {
      boolean var7 = true;
      boolean var8 = true;

      int var9;
      for (var9 = 0; var9 < 4; ++var9) {
         if (this.hitSplatCycles[var9] > cycle) {
            var7 = false;
         } else {
            var8 = false;
         }
      }

      var9 = -1;
      int var10 = -1;
      int var11 = 0;
      if (type >= 0) {
         HitSplatDefinition var12 = LoginScreenAnimation.getHitSplatDefinition(type);
         var10 = var12.field396;
         var11 = var12.field387;
      }

      int var14;
      if (var8) {
         if (var10 == -1) {
            return;
         }

         var9 = 0;
         var14 = 0;
         if (var10 == 0) {
            var14 = this.hitSplatCycles[0];
         } else if (var10 == 1) {
            var14 = this.hitSplatValues[0];
         }

         for (int var13 = 1; var13 < 4; ++var13) {
            if (var10 == 0) {
               if (this.hitSplatCycles[var13] < var14) {
                  var9 = var13;
                  var14 = this.hitSplatCycles[var13];
               }
            } else if (var10 == 1 && this.hitSplatValues[var13] < var14) {
               var9 = var13;
               var14 = this.hitSplatValues[var13];
            }
         }

         if (var10 == 1 && var14 >= value) {
            return;
         }
      } else {
         if (var7) {
            this.hitSplatCount = 0;
         }

         for (var14 = 0; var14 < 4; ++var14) {
            byte var15 = this.hitSplatCount;
            this.hitSplatCount = (byte)((this.hitSplatCount + 1) % 4);
            if (this.hitSplatCycles[var15] <= cycle) {
               var9 = var15;
               break;
            }
         }
      }

      if (var9 >= 0) {
         this.hitSplatTypes[var9] = type;
         this.hitSplatValues[var9] = value;
         this.hitSplatTypes2[var9] = type2;
         this.hitSplatValues2[var9] = value2;
         this.hitSplatCycles[var9] = cycle + var11 + cycle2;
      }

   }

   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      signature = "(IIIIIIB)V",
      garbageValue = "27"
   )
   @Export("addHealthBar")
   final void addHealthBar(int healthBarDefinition, int cycle, int var3, int var4, int var5, int var6) {
      HealthBarDefinition var7 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)healthBarDefinition);
      HealthBarDefinition var8;
      if (var7 != null) {
         var8 = var7;
      } else {
         byte[] var9 = HealthBarDefinition.field379.takeFile(33, healthBarDefinition);
         var7 = new HealthBarDefinition();
         if (var9 != null) {
            var7.decode(new Buffer(var9));
         }

         HealthBarDefinition.HealthBarDefinition_cached.put(var7, (long)healthBarDefinition);
         var8 = var7;
      }

      var7 = var8;
      HealthBar var14 = null;
      HealthBar var10 = null;
      int var11 = var8.int2;
      int var12 = 0;

      HealthBar var13;
      for (var13 = (HealthBar)this.healthBars.last(); var13 != null; var13 = (HealthBar)this.healthBars.previous()) {
         ++var12;
         if (var13.definition.field381 == var7.field381) {
            var13.put(cycle + var4, var5, var6, var3);
            return;
         }

         if (var13.definition.int1 <= var7.int1) {
            var14 = var13;
         }

         if (var13.definition.int2 > var11) {
            var10 = var13;
            var11 = var13.definition.int2;
         }
      }

      if (var10 != null || var12 < 4) {
         var13 = new HealthBar(var7);
         if (var14 == null) {
            this.healthBars.addLast(var13);
         } else {
            IterableNodeDeque.IterableNodeDeque_addBefore(var13, var14);
         }

         var13.put(cycle + var4, var5, var6, var3);
         if (var12 >= 4) {
            var10.remove();
         }
      }

   }

   @ObfuscatedName("bn")
   @ObfuscatedSignature(
      signature = "(IS)V",
      garbageValue = "-31198"
   )
   @Export("removeHealthBar")
   final void removeHealthBar(int healthBarDefinition) {
      HealthBarDefinition var2 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)healthBarDefinition);
      HealthBarDefinition var3;
      if (var2 != null) {
         var3 = var2;
      } else {
         byte[] var4 = HealthBarDefinition.field379.takeFile(33, healthBarDefinition);
         var2 = new HealthBarDefinition();
         if (var4 != null) {
            var2.decode(new Buffer(var4));
         }

         HealthBarDefinition.HealthBarDefinition_cached.put(var2, (long)healthBarDefinition);
         var3 = var2;
      }

      var2 = var3;

      for (HealthBar var5 = (HealthBar)this.healthBars.last(); var5 != null; var5 = (HealthBar)this.healthBars.previous()) {
         if (var2 == var5.definition) {
            var5.remove();
            return;
         }
      }

   }

   @ObfuscatedName("hb")
   @ObfuscatedSignature(
      signature = "(IIIILjava/lang/String;Ljava/lang/String;III)V",
      garbageValue = "493234011"
   )
   @Export("menuAction")
   static final void menuAction(int argument1, int argument2, int opcode, int argument0, String action, String targetName, int mouseX, int mouseY) {
      if (opcode >= 2000) {
         opcode -= 2000;
      }

      PacketBufferNode var8;
      if (opcode == 1) {
         Client.mouseCrossX = mouseX;
         Client.mouseCrossY = mouseY;
         Client.mouseCrossColor = 2;
         Client.mouseCrossState = 0;
         Client.destinationX = argument1;
         Client.destinationY = argument2;
         var8 = Interpreter.method1915(ClientPacket.field266, Client.packetWriter.isaacCipher);
         var8.packetBuffer.method64(GraphicsObject.baseY + argument2);
         var8.packetBuffer.writeShortLE(HealthBarDefinition.selectedItemSlot);
         var8.packetBuffer.method55(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
         var8.packetBuffer.writeIntLE(ServerPacket.selectedItemWidget);
         var8.packetBuffer.method64(argument1 + class50.baseX);
         var8.packetBuffer.writeShort(argument0);
         var8.packetBuffer.writeShortLE(MenuAction.selectedItemId);
         Client.packetWriter.method241(var8);
      } else if (opcode == 2) {
         Client.mouseCrossX = mouseX;
         Client.mouseCrossY = mouseY;
         Client.mouseCrossColor = 2;
         Client.mouseCrossState = 0;
         Client.destinationX = argument1;
         Client.destinationY = argument2;
         var8 = Interpreter.method1915(ClientPacket.field314, Client.packetWriter.isaacCipher);
         var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
         var8.packetBuffer.writeShort(argument1 + class50.baseX);
         var8.packetBuffer.method63(argument0);
         var8.packetBuffer.writeIntLE16(ServerBuild.field788);
         var8.packetBuffer.writeShort(Client.field220);
         var8.packetBuffer.writeShortLE(GraphicsObject.baseY + argument2);
         Client.packetWriter.method241(var8);
      } else if (opcode == 3) {
         Client.mouseCrossX = mouseX;
         Client.mouseCrossY = mouseY;
         Client.mouseCrossColor = 2;
         Client.mouseCrossState = 0;
         Client.destinationX = argument1;
         Client.destinationY = argument2;
         var8 = Interpreter.method1915(ClientPacket.field232, Client.packetWriter.isaacCipher);
         var8.packetBuffer.writeShort(GraphicsObject.baseY + argument2);
         var8.packetBuffer.method57(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
         var8.packetBuffer.method63(argument0);
         var8.packetBuffer.method64(argument1 + class50.baseX);
         Client.packetWriter.method241(var8);
      } else if (opcode == 4) {
         Client.mouseCrossX = mouseX;
         Client.mouseCrossY = mouseY;
         Client.mouseCrossColor = 2;
         Client.mouseCrossState = 0;
         Client.destinationX = argument1;
         Client.destinationY = argument2;
         var8 = Interpreter.method1915(ClientPacket.field301, Client.packetWriter.isaacCipher);
         var8.packetBuffer.method55(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
         var8.packetBuffer.writeShort(argument0);
         var8.packetBuffer.writeShort(GraphicsObject.baseY + argument2);
         var8.packetBuffer.writeShort(argument1 + class50.baseX);
         Client.packetWriter.method241(var8);
      } else if (opcode == 5) {
         Client.mouseCrossX = mouseX;
         Client.mouseCrossY = mouseY;
         Client.mouseCrossColor = 2;
         Client.mouseCrossState = 0;
         Client.destinationX = argument1;
         Client.destinationY = argument2;
         var8 = Interpreter.method1915(ClientPacket.field311, Client.packetWriter.isaacCipher);
         var8.packetBuffer.method64(argument1 + class50.baseX);
         var8.packetBuffer.method63(argument0);
         var8.packetBuffer.method64(GraphicsObject.baseY + argument2);
         var8.packetBuffer.method55(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
         Client.packetWriter.method241(var8);
      } else if (opcode == 6) {
         Client.mouseCrossX = mouseX;
         Client.mouseCrossY = mouseY;
         Client.mouseCrossColor = 2;
         Client.mouseCrossState = 0;
         Client.destinationX = argument1;
         Client.destinationY = argument2;
         var8 = Interpreter.method1915(ClientPacket.field225, Client.packetWriter.isaacCipher);
         var8.packetBuffer.method55(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
         var8.packetBuffer.method63(GraphicsObject.baseY + argument2);
         var8.packetBuffer.method63(argument1 + class50.baseX);
         var8.packetBuffer.writeShortLE(argument0);
         Client.packetWriter.method241(var8);
      } else {
         PacketBufferNode var9;
         NPC var10;
         if (opcode == 7) {
            var10 = Client.npcs[argument0];
            if (var10 != null) {
               Client.mouseCrossX = mouseX;
               Client.mouseCrossY = mouseY;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = argument1;
               Client.destinationY = argument2;
               var9 = Interpreter.method1915(ClientPacket.field245, Client.packetWriter.isaacCipher);
               var9.packetBuffer.method64(MenuAction.selectedItemId);
               var9.packetBuffer.writeShort(HealthBarDefinition.selectedItemSlot);
               var9.packetBuffer.method64(argument0);
               var9.packetBuffer.method56(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
               var9.packetBuffer.writeInt(ServerPacket.selectedItemWidget);
               Client.packetWriter.method241(var9);
            }
         } else if (opcode == 8) {
            var10 = Client.npcs[argument0];
            if (var10 != null) {
               Client.mouseCrossX = mouseX;
               Client.mouseCrossY = mouseY;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = argument1;
               Client.destinationY = argument2;
               var9 = Interpreter.method1915(ClientPacket.field308, Client.packetWriter.isaacCipher);
               var9.packetBuffer.method64(argument0);
               var9.packetBuffer.method56(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
               var9.packetBuffer.writeIntLE(ServerBuild.field788);
               var9.packetBuffer.method63(Client.field220);
               Client.packetWriter.method241(var9);
            }
         } else if (opcode == 9) {
            var10 = Client.npcs[argument0];
            if (var10 != null) {
               Client.mouseCrossX = mouseX;
               Client.mouseCrossY = mouseY;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = argument1;
               Client.destinationY = argument2;
               var9 = Interpreter.method1915(ClientPacket.field293, Client.packetWriter.isaacCipher);
               var9.packetBuffer.method56(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
               var9.packetBuffer.writeShortLE(argument0);
               Client.packetWriter.method241(var9);
            }
         } else if (opcode == 10) {
            var10 = Client.npcs[argument0];
            if (var10 != null) {
               Client.mouseCrossX = mouseX;
               Client.mouseCrossY = mouseY;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = argument1;
               Client.destinationY = argument2;
               var9 = Interpreter.method1915(ClientPacket.field223, Client.packetWriter.isaacCipher);
               var9.packetBuffer.method63(argument0);
               var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
               Client.packetWriter.method241(var9);
            }
         } else if (opcode == 11) {
            var10 = Client.npcs[argument0];
            if (var10 != null) {
               Client.mouseCrossX = mouseX;
               Client.mouseCrossY = mouseY;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = argument1;
               Client.destinationY = argument2;
               var9 = Interpreter.method1915(ClientPacket.field255, Client.packetWriter.isaacCipher);
               var9.packetBuffer.method64(argument0);
               var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
               Client.packetWriter.method241(var9);
            }
         } else if (opcode == 12) {
            var10 = Client.npcs[argument0];
            if (var10 != null) {
               Client.mouseCrossX = mouseX;
               Client.mouseCrossY = mouseY;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = argument1;
               Client.destinationY = argument2;
               var9 = Interpreter.method1915(ClientPacket.field281, Client.packetWriter.isaacCipher);
               var9.packetBuffer.writeShort(argument0);
               var9.packetBuffer.method55(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
               Client.packetWriter.method241(var9);
            }
         } else if (opcode == 13) {
            var10 = Client.npcs[argument0];
            if (var10 != null) {
               Client.mouseCrossX = mouseX;
               Client.mouseCrossY = mouseY;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = argument1;
               Client.destinationY = argument2;
               var9 = Interpreter.method1915(ClientPacket.field253, Client.packetWriter.isaacCipher);
               var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
               var9.packetBuffer.method63(argument0);
               Client.packetWriter.method241(var9);
            }
         } else {
            Player var11;
            if (opcode == 14) {
               var11 = Client.players[argument0];
               if (var11 != null) {
                  Client.mouseCrossX = mouseX;
                  Client.mouseCrossY = mouseY;
                  Client.mouseCrossColor = 2;
                  Client.mouseCrossState = 0;
                  Client.destinationX = argument1;
                  Client.destinationY = argument2;
                  var9 = Interpreter.method1915(ClientPacket.field303, Client.packetWriter.isaacCipher);
                  var9.packetBuffer.method64(HealthBarDefinition.selectedItemSlot);
                  var9.packetBuffer.method57(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
                  var9.packetBuffer.writeIntME(ServerPacket.selectedItemWidget);
                  var9.packetBuffer.writeShort(argument0);
                  var9.packetBuffer.writeShort(MenuAction.selectedItemId);
                  Client.packetWriter.method241(var9);
               }
            } else if (opcode == 15) {
               var11 = Client.players[argument0];
               if (var11 != null) {
                  Client.mouseCrossX = mouseX;
                  Client.mouseCrossY = mouseY;
                  Client.mouseCrossColor = 2;
                  Client.mouseCrossState = 0;
                  Client.destinationX = argument1;
                  Client.destinationY = argument2;
                  var9 = Interpreter.method1915(ClientPacket.field277, Client.packetWriter.isaacCipher);
                  var9.packetBuffer.writeIntLE16(ServerBuild.field788);
                  var9.packetBuffer.method57(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
                  var9.packetBuffer.method63(Client.field220);
                  var9.packetBuffer.writeShort(argument0);
                  Client.packetWriter.method241(var9);
               }
            } else if (opcode == 16) {
               Client.mouseCrossX = mouseX;
               Client.mouseCrossY = mouseY;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = argument1;
               Client.destinationY = argument2;
               var8 = Interpreter.method1915(ClientPacket.field240, Client.packetWriter.isaacCipher);
               var8.packetBuffer.writeIntME(ServerPacket.selectedItemWidget);
               var8.packetBuffer.method64(MenuAction.selectedItemId);
               var8.packetBuffer.method55(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
               var8.packetBuffer.writeShortLE(HealthBarDefinition.selectedItemSlot);
               var8.packetBuffer.method64(argument0);
               var8.packetBuffer.method64(argument1 + class50.baseX);
               var8.packetBuffer.writeShortLE(GraphicsObject.baseY + argument2);
               Client.packetWriter.method241(var8);
            } else if (opcode == 17) {
               Client.mouseCrossX = mouseX;
               Client.mouseCrossY = mouseY;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = argument1;
               Client.destinationY = argument2;
               var8 = Interpreter.method1915(ClientPacket.field275, Client.packetWriter.isaacCipher);
               var8.packetBuffer.writeIntME(ServerBuild.field788);
               var8.packetBuffer.writeShort(Client.field220);
               var8.packetBuffer.method63(GraphicsObject.baseY + argument2);
               var8.packetBuffer.method63(argument1 + class50.baseX);
               var8.packetBuffer.method55(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
               var8.packetBuffer.writeShortLE(argument0);
               Client.packetWriter.method241(var8);
            } else if (opcode == 18) {
               Client.mouseCrossX = mouseX;
               Client.mouseCrossY = mouseY;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = argument1;
               Client.destinationY = argument2;
               var8 = Interpreter.method1915(ClientPacket.field227, Client.packetWriter.isaacCipher);
               var8.packetBuffer.method64(GraphicsObject.baseY + argument2);
               var8.packetBuffer.writeShortLE(argument0);
               var8.packetBuffer.writeShortLE(argument1 + class50.baseX);
               var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
               Client.packetWriter.method241(var8);
            } else if (opcode == 19) {
               Client.mouseCrossX = mouseX;
               Client.mouseCrossY = mouseY;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = argument1;
               Client.destinationY = argument2;
               var8 = Interpreter.method1915(ClientPacket.field296, Client.packetWriter.isaacCipher);
               var8.packetBuffer.method64(argument0);
               var8.packetBuffer.method63(argument1 + class50.baseX);
               var8.packetBuffer.writeShort(GraphicsObject.baseY + argument2);
               var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
               Client.packetWriter.method241(var8);
            } else if (opcode == 20) {
               Client.mouseCrossX = mouseX;
               Client.mouseCrossY = mouseY;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = argument1;
               Client.destinationY = argument2;
               var8 = Interpreter.method1915(ClientPacket.field228, Client.packetWriter.isaacCipher);
               var8.packetBuffer.writeShortLE(GraphicsObject.baseY + argument2);
               var8.packetBuffer.method57(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
               var8.packetBuffer.writeShortLE(argument1 + class50.baseX);
               var8.packetBuffer.writeShortLE(argument0);
               Client.packetWriter.method241(var8);
            } else if (opcode == 21) {
               Client.mouseCrossX = mouseX;
               Client.mouseCrossY = mouseY;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = argument1;
               Client.destinationY = argument2;
               var8 = Interpreter.method1915(ClientPacket.field251, Client.packetWriter.isaacCipher);
               var8.packetBuffer.method63(GraphicsObject.baseY + argument2);
               var8.packetBuffer.writeShortLE(argument0);
               var8.packetBuffer.writeShort(argument1 + class50.baseX);
               var8.packetBuffer.method57(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
               Client.packetWriter.method241(var8);
            } else if (opcode == 22) {
               Client.mouseCrossX = mouseX;
               Client.mouseCrossY = mouseY;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = argument1;
               Client.destinationY = argument2;
               var8 = Interpreter.method1915(ClientPacket.field273, Client.packetWriter.isaacCipher);
               var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
               var8.packetBuffer.method64(argument0);
               var8.packetBuffer.method63(GraphicsObject.baseY + argument2);
               var8.packetBuffer.writeShort(argument1 + class50.baseX);
               Client.packetWriter.method241(var8);
            } else if (opcode == 23) {
               if (Client.isMenuOpen) {
                  class65.scene.method296();
               } else {
                  class65.scene.menuOpen(SoundSystem.plane, argument1, argument2, true);
               }
            } else {
               PacketBufferNode var12;
               Widget var13;
               if (opcode == 24) {
                  var13 = Huffman.getWidget(argument2);
                  boolean var14 = true;
                  if (var13.contentType > 0) {
                     var14 = ViewportMouse.method2957(var13);
                  }

                  if (var14) {
                     var12 = Interpreter.method1915(ClientPacket.field291, Client.packetWriter.isaacCipher);
                     var12.packetBuffer.writeInt(argument2);
                     Client.packetWriter.method241(var12);
                  }
               } else {
                  if (opcode == 25) {
                     var13 = class204.getWidgetChild(argument2, argument1);
                     if (var13 != null) {
                        Player.method1281();
                        WorldMapDecoration.method350(argument2, argument1, class211.method4107(class1.getWidgetClickMask(var13)), var13.itemId);
                        Client.isItemSelected = 0;
                        Client.selectedSpellActionName = class198.method3745(var13);
                        if (Client.selectedSpellActionName == null) {
                           Client.selectedSpellActionName = "null";
                        }

                        if (var13.isIf3) {
                           Client.selectedSpellName = var13.dataText + BufferedFile.colorStartTag(16777215);
                        } else {
                           Client.selectedSpellName = BufferedFile.colorStartTag(65280) + var13.spellName + BufferedFile.colorStartTag(16777215);
                        }
                     }

                     return;
                  }

                  if (opcode == 26) {
                     WorldMapLabelSize.method198();
                  } else {
                     int var15;
                     Widget var17;
                     if (opcode == 28) {
                        var8 = Interpreter.method1915(ClientPacket.field291, Client.packetWriter.isaacCipher);
                        var8.packetBuffer.writeInt(argument2);
                        Client.packetWriter.method241(var8);
                        var17 = Huffman.getWidget(argument2);
                        if (var17.cs1Instructions != null && var17.cs1Instructions[0][0] == 5) {
                           var15 = var17.cs1Instructions[0][1];
                           Varps.Varps_main[var15] = 1 - Varps.Varps_main[var15];
                           Archive.method4703(var15);
                        }
                     } else if (opcode == 29) {
                        var8 = Interpreter.method1915(ClientPacket.field291, Client.packetWriter.isaacCipher);
                        var8.packetBuffer.writeInt(argument2);
                        Client.packetWriter.method241(var8);
                        var17 = Huffman.getWidget(argument2);
                        if (var17.cs1Instructions != null && var17.cs1Instructions[0][0] == 5) {
                           var15 = var17.cs1Instructions[0][1];
                           if (Varps.Varps_main[var15] != var17.cs1ComparisonValues[0]) {
                              Varps.Varps_main[var15] = var17.cs1ComparisonValues[0];
                              Archive.method4703(var15);
                           }
                        }
                     } else if (opcode == 30) {
                        if (Client.field127 == null) {
                           TilePaint.method3060(argument2, argument1);
                           Client.field127 = class204.getWidgetChild(argument2, argument1);
                           class22.method295(Client.field127);
                        }
                     } else if (opcode == 31) {
                        var8 = Interpreter.method1915(ClientPacket.field285, Client.packetWriter.isaacCipher);
                        var8.packetBuffer.writeIntME(argument2);
                        var8.packetBuffer.writeIntLE16(ServerPacket.selectedItemWidget);
                        var8.packetBuffer.method64(HealthBarDefinition.selectedItemSlot);
                        var8.packetBuffer.writeShortLE(MenuAction.selectedItemId);
                        var8.packetBuffer.writeShortLE(argument1);
                        var8.packetBuffer.method64(argument0);
                        Client.packetWriter.method241(var8);
                        Client.field203 = 0;
                        BoundaryObject.field40 = Huffman.getWidget(argument2);
                        Client.field204 = argument1;
                     } else if (opcode == 32) {
                        var8 = Interpreter.method1915(ClientPacket.field224, Client.packetWriter.isaacCipher);
                        var8.packetBuffer.writeIntME(ServerBuild.field788);
                        var8.packetBuffer.writeInt(argument2);
                        var8.packetBuffer.writeShort(argument1);
                        var8.packetBuffer.writeShortLE(argument0);
                        var8.packetBuffer.writeShortLE(Client.field220);
                        Client.packetWriter.method241(var8);
                        Client.field203 = 0;
                        BoundaryObject.field40 = Huffman.getWidget(argument2);
                        Client.field204 = argument1;
                     } else if (opcode == 33) {
                        var8 = Interpreter.method1915(ClientPacket.field309, Client.packetWriter.isaacCipher);
                        var8.packetBuffer.writeShortLE(argument0);
                        var8.packetBuffer.writeIntME(argument2);
                        var8.packetBuffer.writeShort(argument1);
                        Client.packetWriter.method241(var8);
                        Client.field203 = 0;
                        BoundaryObject.field40 = Huffman.getWidget(argument2);
                        Client.field204 = argument1;
                     } else if (opcode == 34) {
                        var8 = Interpreter.method1915(ClientPacket.field320, Client.packetWriter.isaacCipher);
                        var8.packetBuffer.method63(argument0);
                        var8.packetBuffer.writeIntLE16(argument2);
                        var8.packetBuffer.method64(argument1);
                        Client.packetWriter.method241(var8);
                        Client.field203 = 0;
                        BoundaryObject.field40 = Huffman.getWidget(argument2);
                        Client.field204 = argument1;
                     } else if (opcode == 35) {
                        var8 = Interpreter.method1915(ClientPacket.field294, Client.packetWriter.isaacCipher);
                        var8.packetBuffer.writeIntLE(argument2);
                        var8.packetBuffer.method64(argument1);
                        var8.packetBuffer.method64(argument0);
                        Client.packetWriter.method241(var8);
                        Client.field203 = 0;
                        BoundaryObject.field40 = Huffman.getWidget(argument2);
                        Client.field204 = argument1;
                     } else if (opcode == 36) {
                        var8 = Interpreter.method1915(ClientPacket.field229, Client.packetWriter.isaacCipher);
                        var8.packetBuffer.method64(argument0);
                        var8.packetBuffer.writeInt(argument2);
                        var8.packetBuffer.method64(argument1);
                        Client.packetWriter.method241(var8);
                        Client.field203 = 0;
                        BoundaryObject.field40 = Huffman.getWidget(argument2);
                        Client.field204 = argument1;
                     } else if (opcode == 37) {
                        var8 = Interpreter.method1915(ClientPacket.field280, Client.packetWriter.isaacCipher);
                        var8.packetBuffer.writeInt(argument2);
                        var8.packetBuffer.writeShort(argument1);
                        var8.packetBuffer.writeShort(argument0);
                        Client.packetWriter.method241(var8);
                        Client.field203 = 0;
                        BoundaryObject.field40 = Huffman.getWidget(argument2);
                        Client.field204 = argument1;
                     } else {
                        if (opcode == 38) {
                           Player.method1281();
                           var13 = Huffman.getWidget(argument2);
                           Client.isItemSelected = 1;
                           HealthBarDefinition.selectedItemSlot = argument1;
                           ServerPacket.selectedItemWidget = argument2;
                           MenuAction.selectedItemId = argument0;
                           class22.method295(var13);
                           Client.selectedItemName = BufferedFile.colorStartTag(16748608) + Skills.getItemDefinition(argument0).name + BufferedFile.colorStartTag(16777215);
                           if (Client.selectedItemName == null) {
                              Client.selectedItemName = "null";
                           }

                           return;
                        }

                        if (opcode == 39) {
                           var8 = Interpreter.method1915(ClientPacket.field268, Client.packetWriter.isaacCipher);
                           var8.packetBuffer.method64(argument0);
                           var8.packetBuffer.writeIntLE16(argument2);
                           var8.packetBuffer.writeShortLE(argument1);
                           Client.packetWriter.method241(var8);
                           Client.field203 = 0;
                           BoundaryObject.field40 = Huffman.getWidget(argument2);
                           Client.field204 = argument1;
                        } else if (opcode == 40) {
                           var8 = Interpreter.method1915(ClientPacket.field248, Client.packetWriter.isaacCipher);
                           var8.packetBuffer.writeIntLE16(argument2);
                           var8.packetBuffer.writeShortLE(argument1);
                           var8.packetBuffer.method63(argument0);
                           Client.packetWriter.method241(var8);
                           Client.field203 = 0;
                           BoundaryObject.field40 = Huffman.getWidget(argument2);
                           Client.field204 = argument1;
                        } else if (opcode == 41) {
                           var8 = Interpreter.method1915(ClientPacket.field287, Client.packetWriter.isaacCipher);
                           var8.packetBuffer.writeIntLE(argument2);
                           var8.packetBuffer.method63(argument1);
                           var8.packetBuffer.writeShort(argument0);
                           Client.packetWriter.method241(var8);
                           Client.field203 = 0;
                           BoundaryObject.field40 = Huffman.getWidget(argument2);
                           Client.field204 = argument1;
                        } else if (opcode == 42) {
                           var8 = Interpreter.method1915(ClientPacket.field286, Client.packetWriter.isaacCipher);
                           var8.packetBuffer.writeInt(argument2);
                           var8.packetBuffer.method63(argument1);
                           var8.packetBuffer.writeShort(argument0);
                           Client.packetWriter.method241(var8);
                           Client.field203 = 0;
                           BoundaryObject.field40 = Huffman.getWidget(argument2);
                           Client.field204 = argument1;
                        } else if (opcode == 43) {
                           var8 = Interpreter.method1915(ClientPacket.field254, Client.packetWriter.isaacCipher);
                           var8.packetBuffer.writeShort(argument0);
                           var8.packetBuffer.writeIntME(argument2);
                           var8.packetBuffer.writeShort(argument1);
                           Client.packetWriter.method241(var8);
                           Client.field203 = 0;
                           BoundaryObject.field40 = Huffman.getWidget(argument2);
                           Client.field204 = argument1;
                        } else if (opcode == 44) {
                           var11 = Client.players[argument0];
                           if (var11 != null) {
                              Client.mouseCrossX = mouseX;
                              Client.mouseCrossY = mouseY;
                              Client.mouseCrossColor = 2;
                              Client.mouseCrossState = 0;
                              Client.destinationX = argument1;
                              Client.destinationY = argument2;
                              var9 = Interpreter.method1915(ClientPacket.field269, Client.packetWriter.isaacCipher);
                              var9.packetBuffer.writeShort(argument0);
                              var9.packetBuffer.method56(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
                              Client.packetWriter.method241(var9);
                           }
                        } else if (opcode == 45) {
                           var11 = Client.players[argument0];
                           if (var11 != null) {
                              Client.mouseCrossX = mouseX;
                              Client.mouseCrossY = mouseY;
                              Client.mouseCrossColor = 2;
                              Client.mouseCrossState = 0;
                              Client.destinationX = argument1;
                              Client.destinationY = argument2;
                              var9 = Interpreter.method1915(ClientPacket.field278, Client.packetWriter.isaacCipher);
                              var9.packetBuffer.method55(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
                              var9.packetBuffer.method63(argument0);
                              Client.packetWriter.method241(var9);
                           }
                        } else if (opcode == 46) {
                           var11 = Client.players[argument0];
                           if (var11 != null) {
                              Client.mouseCrossX = mouseX;
                              Client.mouseCrossY = mouseY;
                              Client.mouseCrossColor = 2;
                              Client.mouseCrossState = 0;
                              Client.destinationX = argument1;
                              Client.destinationY = argument2;
                              var9 = Interpreter.method1915(ClientPacket.field284, Client.packetWriter.isaacCipher);
                              var9.packetBuffer.method63(argument0);
                              var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
                              Client.packetWriter.method241(var9);
                           }
                        } else if (opcode == 47) {
                           var11 = Client.players[argument0];
                           if (var11 != null) {
                              Client.mouseCrossX = mouseX;
                              Client.mouseCrossY = mouseY;
                              Client.mouseCrossColor = 2;
                              Client.mouseCrossState = 0;
                              Client.destinationX = argument1;
                              Client.destinationY = argument2;
                              var9 = Interpreter.method1915(ClientPacket.field249, Client.packetWriter.isaacCipher);
                              var9.packetBuffer.method64(argument0);
                              var9.packetBuffer.method56(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
                              Client.packetWriter.method241(var9);
                           }
                        } else if (opcode == 48) {
                           var11 = Client.players[argument0];
                           if (var11 != null) {
                              Client.mouseCrossX = mouseX;
                              Client.mouseCrossY = mouseY;
                              Client.mouseCrossColor = 2;
                              Client.mouseCrossState = 0;
                              Client.destinationX = argument1;
                              Client.destinationY = argument2;
                              var9 = Interpreter.method1915(ClientPacket.field305, Client.packetWriter.isaacCipher);
                              var9.packetBuffer.method55(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
                              var9.packetBuffer.method63(argument0);
                              Client.packetWriter.method241(var9);
                           }
                        } else if (opcode == 49) {
                           var11 = Client.players[argument0];
                           if (var11 != null) {
                              Client.mouseCrossX = mouseX;
                              Client.mouseCrossY = mouseY;
                              Client.mouseCrossColor = 2;
                              Client.mouseCrossState = 0;
                              Client.destinationX = argument1;
                              Client.destinationY = argument2;
                              var9 = Interpreter.method1915(ClientPacket.field315, Client.packetWriter.isaacCipher);
                              var9.packetBuffer.method63(argument0);
                              var9.packetBuffer.method57(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
                              Client.packetWriter.method241(var9);
                           }
                        } else if (opcode == 50) {
                           var11 = Client.players[argument0];
                           if (var11 != null) {
                              Client.mouseCrossX = mouseX;
                              Client.mouseCrossY = mouseY;
                              Client.mouseCrossColor = 2;
                              Client.mouseCrossState = 0;
                              Client.destinationX = argument1;
                              Client.destinationY = argument2;
                              var9 = Interpreter.method1915(ClientPacket.field297, Client.packetWriter.isaacCipher);
                              var9.packetBuffer.method57(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
                              var9.packetBuffer.writeShortLE(argument0);
                              Client.packetWriter.method241(var9);
                           }
                        } else if (opcode == 51) {
                           var11 = Client.players[argument0];
                           if (var11 != null) {
                              Client.mouseCrossX = mouseX;
                              Client.mouseCrossY = mouseY;
                              Client.mouseCrossColor = 2;
                              Client.mouseCrossState = 0;
                              Client.destinationX = argument1;
                              Client.destinationY = argument2;
                              var9 = Interpreter.method1915(ClientPacket.field272, Client.packetWriter.isaacCipher);
                              var9.packetBuffer.method56(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
                              var9.packetBuffer.method64(argument0);
                              Client.packetWriter.method241(var9);
                           }
                        } else {
                           label415: {
                              if (opcode != 57) {
                                 if (opcode == 58) {
                                    var13 = class204.getWidgetChild(argument2, argument1);
                                    if (var13 != null) {
                                       var9 = Interpreter.method1915(ClientPacket.field304, Client.packetWriter.isaacCipher);
                                       var9.packetBuffer.writeShortLE(Client.field220);
                                       var9.packetBuffer.writeIntLE16(argument2);
                                       var9.packetBuffer.writeShortLE(Client.field157);
                                       var9.packetBuffer.method64(argument1);
                                       var9.packetBuffer.writeInt(ServerBuild.field788);
                                       var9.packetBuffer.method64(var13.itemId);
                                       Client.packetWriter.method241(var9);
                                    }
                                    break label415;
                                 }

                                 if (opcode == 1001) {
                                    Client.mouseCrossX = mouseX;
                                    Client.mouseCrossY = mouseY;
                                    Client.mouseCrossColor = 2;
                                    Client.mouseCrossState = 0;
                                    Client.destinationX = argument1;
                                    Client.destinationY = argument2;
                                    var8 = Interpreter.method1915(ClientPacket.field316, Client.packetWriter.isaacCipher);
                                    var8.packetBuffer.writeShort(argument0);
                                    var8.packetBuffer.method55(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
                                    var8.packetBuffer.method63(argument1 + class50.baseX);
                                    var8.packetBuffer.method64(GraphicsObject.baseY + argument2);
                                    Client.packetWriter.method241(var8);
                                    break label415;
                                 }

                                 if (opcode == 1002) {
                                    Client.mouseCrossX = mouseX;
                                    Client.mouseCrossY = mouseY;
                                    Client.mouseCrossColor = 2;
                                    Client.mouseCrossState = 0;
                                    var8 = Interpreter.method1915(ClientPacket.field258, Client.packetWriter.isaacCipher);
                                    var8.packetBuffer.method63(argument0);
                                    Client.packetWriter.method241(var8);
                                    break label415;
                                 }

                                 if (opcode == 1003) {
                                    Client.mouseCrossX = mouseX;
                                    Client.mouseCrossY = mouseY;
                                    Client.mouseCrossColor = 2;
                                    Client.mouseCrossState = 0;
                                    var10 = Client.npcs[argument0];
                                    if (var10 != null) {
                                       NPCDefinition var16 = var10.definition;
                                       if (var16.transforms != null) {
                                          var16 = var16.transform();
                                       }

                                       if (var16 != null) {
                                          var12 = Interpreter.method1915(ClientPacket.field252, Client.packetWriter.isaacCipher);
                                          var12.packetBuffer.method63(var16.id);
                                          Client.packetWriter.method241(var12);
                                       }
                                    }
                                    break label415;
                                 }

                                 if (opcode == 1004) {
                                    Client.mouseCrossX = mouseX;
                                    Client.mouseCrossY = mouseY;
                                    Client.mouseCrossColor = 2;
                                    Client.mouseCrossState = 0;
                                    var8 = Interpreter.method1915(ClientPacket.field246, Client.packetWriter.isaacCipher);
                                    var8.packetBuffer.writeShortLE(argument0);
                                    Client.packetWriter.method241(var8);
                                    break label415;
                                 }

                                 if (opcode == 1005) {
                                    var13 = Huffman.getWidget(argument2);
                                    if (var13 != null && var13.itemQuantities[argument1] >= 100000) {
                                       WorldMapIcon1.addGameMessage(27, "", var13.itemQuantities[argument1] + " x " + Skills.getItemDefinition(argument0).name);
                                    } else {
                                       var9 = Interpreter.method1915(ClientPacket.field246, Client.packetWriter.isaacCipher);
                                       var9.packetBuffer.writeShortLE(argument0);
                                       Client.packetWriter.method241(var9);
                                    }

                                    Client.field203 = 0;
                                    BoundaryObject.field40 = Huffman.getWidget(argument2);
                                    Client.field204 = argument1;
                                    break label415;
                                 }

                                 if (opcode != 1007) {
                                    if (opcode == 1008 || opcode == 1011 || opcode == 1010 || opcode == 1009 || opcode == 1012) {
                                       class60.worldMap0.menuAction(opcode, argument0, new Coord(argument1), new Coord(argument2));
                                    }
                                    break label415;
                                 }
                              }

                              var13 = class204.getWidgetChild(argument2, argument1);
                              if (var13 != null) {
                                 class171.method3494(argument0, argument2, argument1, var13.itemId, targetName);
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      if (Client.isItemSelected != 0) {
         Client.isItemSelected = 0;
         class22.method295(Huffman.getWidget(ServerPacket.selectedItemWidget));
      }

      if (Client.isSpellSelected) {
         Player.method1281();
      }

      if (BoundaryObject.field40 != null && Client.field203 == 0) {
         class22.method295(BoundaryObject.field40);
      }

   }
}
