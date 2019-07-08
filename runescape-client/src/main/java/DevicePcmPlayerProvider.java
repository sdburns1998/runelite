import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("az")
@Implements("DevicePcmPlayerProvider")
public class DevicePcmPlayerProvider implements PcmPlayerProvider {
   @ObfuscatedName("fu")
   @ObfuscatedSignature(
      signature = "Lkk;"
   )
   @Export("fontPlain12")
   static Font fontPlain12;
   @ObfuscatedName("jf")
   @ObfuscatedSignature(
      signature = "Lho;"
   )
   @Export("dragInventoryWidget")
   static Widget dragInventoryWidget;

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(B)Lco;",
      garbageValue = "-49"
   )
   @Export("player")
   public PcmPlayer player() {
      return new DevicePcmPlayer();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Ljava/io/File;ZI)Z",
      garbageValue = "248065919"
   )
   public static boolean method847(File var0, boolean var1) {
      try {
         RandomAccessFile var2 = new RandomAccessFile(var0, "rw");
         int var3 = var2.read();
         var2.seek(0L);
         var2.write(var3);
         var2.seek(0L);
         var2.close();
         if (var1) {
            var0.delete();
         }

         return true;
      } catch (Exception var4) {
         return false;
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1746647997"
   )
   public static void method841() {
      KitDefinition.KitDefinition_cached.clear();
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "([BB)V",
      garbageValue = "-9"
   )
   @Export("decodeSprite")
   static void decodeSprite(byte[] var0) {
      Buffer var1 = new Buffer(var0);
      var1.index = var0.length - 2;
      class328.indexedSpriteCount = var1.readUnsignedShort();
      class328.indexedSpriteOffsetXs = new int[class328.indexedSpriteCount];
      class328.indexedSpriteOffsetYs = new int[class328.indexedSpriteCount];
      VarbitDefinition.indexedSpriteWidths = new int[class328.indexedSpriteCount];
      SecureRandomCallable.indexedSpriteHeights = new int[class328.indexedSpriteCount];
      class328.spritePixels = new byte[class328.indexedSpriteCount][];
      var1.index = var0.length - 7 - class328.indexedSpriteCount * 8;
      class328.indexedSpriteWidth = var1.readUnsignedShort();
      class328.indexedSpriteHeight = var1.readUnsignedShort();
      int var2 = (var1.readUnsignedByte() & 255) + 1;

      int var3;
      for (var3 = 0; var3 < class328.indexedSpriteCount; ++var3) {
         class328.indexedSpriteOffsetXs[var3] = var1.readUnsignedShort();
      }

      for (var3 = 0; var3 < class328.indexedSpriteCount; ++var3) {
         class328.indexedSpriteOffsetYs[var3] = var1.readUnsignedShort();
      }

      for (var3 = 0; var3 < class328.indexedSpriteCount; ++var3) {
         VarbitDefinition.indexedSpriteWidths[var3] = var1.readUnsignedShort();
      }

      for (var3 = 0; var3 < class328.indexedSpriteCount; ++var3) {
         SecureRandomCallable.indexedSpriteHeights[var3] = var1.readUnsignedShort();
      }

      var1.index = var0.length - 7 - class328.indexedSpriteCount * 8 - (var2 - 1) * 3;
      class328.indexedSpritePalette = new int[var2];

      for (var3 = 1; var3 < var2; ++var3) {
         class328.indexedSpritePalette[var3] = var1.readMedium();
         if (class328.indexedSpritePalette[var3] == 0) {
            class328.indexedSpritePalette[var3] = 1;
         }
      }

      var1.index = 0;

      for (var3 = 0; var3 < class328.indexedSpriteCount; ++var3) {
         int var4 = VarbitDefinition.indexedSpriteWidths[var3];
         int var5 = SecureRandomCallable.indexedSpriteHeights[var3];
         int var6 = var4 * var5;
         byte[] var7 = new byte[var6];
         class328.spritePixels[var3] = var7;
         int var8 = var1.readUnsignedByte();
         int var9;
         if (var8 == 0) {
            for (var9 = 0; var9 < var6; ++var9) {
               var7[var9] = var1.readByte();
            }
         } else if (var8 == 1) {
            for (var9 = 0; var9 < var4; ++var9) {
               for (int var10 = 0; var10 < var5; ++var10) {
                  var7[var9 + var10 * var4] = var1.readByte();
               }
            }
         }
      }

   }

   @ObfuscatedName("ga")
   @ObfuscatedSignature(
      signature = "(Lbz;II)V",
      garbageValue = "-1590224882"
   )
   static final void method840(Actor var0, int var1) {
      WorldMapLabel.worldToScreen(var0.x, var0.y, var1);
   }

   @ObfuscatedName("ir")
   @ObfuscatedSignature(
      signature = "([Lho;IIIIIIIII)V",
      garbageValue = "-1516599170"
   )
   @Export("drawInterface")
   static final void drawInterface(Widget[] widgets, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
      Rasterizer3D.Rasterizer3D_method1();

      for (int var9 = 0; var9 < widgets.length; ++var9) {
         Widget widget = widgets[var9];
         if (widget != null && (widget.parentId == var1 || var1 == -1412584499 && widget == Client.clickedWidget)) {
            int var11;
            if (var8 == -1) {
               Client.rootWidgetXs[Client.rootWidgetCount] = widget.x + var6;
               Client.rootWidgetYs[Client.rootWidgetCount] = var7 + widget.y;
               Client.rootWidgetWidths[Client.rootWidgetCount] = widget.width;
               Client.rootWidgetHeights[Client.rootWidgetCount] = widget.height;
               var11 = ++Client.rootWidgetCount - 1;
            } else {
               var11 = var8;
            }

            widget.rootIndex = var11;
            widget.cycle = Client.cycle;
            if (!widget.isIf3 || !PacketBufferNode.method3673(widget)) {
               if (widget.contentType > 0) {
                  class15.method186(widget);
               }

               int x = widget.x + var6;
               int y = var7 + widget.y;
               int var14 = widget.transparency;
               int var15;
               int var16;
               if (widget == Client.clickedWidget) {
                  if (var1 != -1412584499 && !widget.isScrollBar) {
                     class279.field1145 = widgets;
                     class54.field1161 = var6;
                     BuddyRankComparator.field1114 = var7;
                     continue;
                  }

                  if (Client.isDraggingWidget && Client.field106) {
                     var15 = MouseHandler.MouseHandler_x;
                     var16 = MouseHandler.MouseHandler_y;
                     var15 -= Client.widgetClickX;
                     var16 -= Client.widgetClickY;
                     if (var15 < Client.field108) {
                        var15 = Client.field108;
                     }

                     if (var15 + widget.width > Client.field108 + Client.clickedWidgetParent.width) {
                        var15 = Client.field108 + Client.clickedWidgetParent.width - widget.width;
                     }

                     if (var16 < Client.field109) {
                        var16 = Client.field109;
                     }

                     if (var16 + widget.height > Client.field109 + Client.clickedWidgetParent.height) {
                        var16 = Client.field109 + Client.clickedWidgetParent.height - widget.height;
                     }

                     x = var15;
                     y = var16;
                  }

                  if (!widget.isScrollBar) {
                     var14 = 128;
                  }
               }

               int var17;
               int var18;
               int var19;
               int var20;
               int var21;
               int var22;
               if (widget.type == 2) {
                  var15 = var2;
                  var16 = var3;
                  var17 = var4;
                  var18 = var5;
               } else if (widget.type == 9) {
                  var22 = x;
                  var19 = y;
                  var20 = x + widget.width;
                  var21 = y + widget.height;
                  if (var20 < x) {
                     var22 = var20;
                     var20 = x;
                  }

                  if (var21 < y) {
                     var19 = var21;
                     var21 = y;
                  }

                  ++var20;
                  ++var21;
                  var15 = var22 > var2 ? var22 : var2;
                  var16 = var19 > var3 ? var19 : var3;
                  var17 = var20 < var4 ? var20 : var4;
                  var18 = var21 < var5 ? var21 : var5;
               } else {
                  var22 = x + widget.width;
                  var19 = y + widget.height;
                  var15 = x > var2 ? x : var2;
                  var16 = y > var3 ? y : var3;
                  var17 = var22 < var4 ? var22 : var4;
                  var18 = var19 < var5 ? var19 : var5;
               }

               if (!widget.isIf3 || var15 < var17 && var16 < var18) {
                  if (widget.contentType != 0) {
                     if (widget.contentType == 1336) {
                        if (Client.displayFps) {
                           y += 15;
                           fontPlain12.drawRightAligned("Fps:" + GameShell.fps, x + widget.width, y, 16776960, -1);
                           y += 15;
                           Runtime var34 = Runtime.getRuntime();
                           var19 = (int)((var34.totalMemory() - var34.freeMemory()) / 1024L);
                           var20 = 16776960;
                           if (var19 > 327680 && !Client.isLowDetail) {
                              var20 = 16711680;
                           }

                           fontPlain12.drawRightAligned("Mem:" + var19 + "k", x + widget.width, y, var20, -1);
                           y += 15;
                        }
                        continue;
                     }

                     if (widget.contentType == 1337) {
                        Client.field216 = x;
                        Client.field217 = y;
                        class40.drawEntities(x, y, widget.width, widget.height);
                        Client.field100[widget.rootIndex] = true;
                        Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
                        continue;
                     }

                     if (widget.contentType == 1338) {
                        MouseRecorder.method1189(widget, x, y, var11);
                        Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
                        continue;
                     }

                     if (widget.contentType == 1339) {
                        WorldMapRectangle.method296(widget, x, y, var11);
                        Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
                        continue;
                     }

                     if (widget.contentType == 1400) {
                        class60.worldMap0.draw(x, y, widget.width, widget.height, Client.cycle);
                     }

                     if (widget.contentType == 1401) {
                        class60.worldMap0.drawOverview(x, y, widget.width, widget.height);
                     }

                     if (widget.contentType == 1402) {
                        class16.loginScreenRunesAnimation.method1782(x, Client.cycle);
                     }
                  }

                  if (widget.type == 0) {
                     if (!widget.isIf3 && PacketBufferNode.method3673(widget) && widget != Clock.mousedOverWidgetIf1) {
                        continue;
                     }

                     if (!widget.isIf3) {
                        if (widget.scrollY > widget.scrollHeight - widget.height) {
                           widget.scrollY = widget.scrollHeight - widget.height;
                        }

                        if (widget.scrollY < 0) {
                           widget.scrollY = 0;
                        }
                     }

                     drawInterface(widgets, widget.id, var15, var16, var17, var18, x - widget.scrollX, y - widget.scrollY, var11);
                     if (widget.children != null) {
                        drawInterface(widget.children, widget.id, var15, var16, var17, var18, x - widget.scrollX, y - widget.scrollY, var11);
                     }

                     InterfaceParent var23 = (InterfaceParent)Client.interfaceParents.get((long) widget.id);
                     if (var23 != null) {
                        Interpreter.drawWidgets(var23.group, var15, var16, var17, var18, x, y, var11);
                     }

                     Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
                     Rasterizer3D.Rasterizer3D_method1();
                  }

                  if (Client.isResizable || Client.field101[var11] || Client.gameDrawingMode > 1) {
                     if (widget.type == 0 && !widget.isIf3 && widget.scrollHeight > widget.height) {
                        GrandExchangeOfferNameComparator.method148(x + widget.width, y, widget.scrollY, widget.height, widget.scrollHeight);
                     }

                     if (widget.type != 1) {
                        int var24;
                        int var25;
                        int var26;
                        int var33;
                        if (widget.type == 2) {
                           var22 = 0;

                           for (var19 = 0; var19 < widget.rawHeight; ++var19) {
                              for (var20 = 0; var20 < widget.rawWidth; ++var20) {
                                 var21 = x + var20 * (widget.paddingX + 32);
                                 var26 = y + var19 * (widget.paddingY + 32);
                                 if (var22 < 20) {
                                    var21 += widget.inventoryXOffsets[var22];
                                    var26 += widget.inventoryYOffsets[var22];
                                 }

                                 if (widget.itemIds[var22] <= 0) {
                                    if (widget.inventorySprites != null && var22 < 20) {
                                       Sprite var36 = widget.getInventorySprite(var22);
                                       if (var36 != null) {
                                          var36.drawAt2(var21, var26);
                                       } else if (Widget.field957) {
                                          WorldMapRectangle.method295(widget);
                                       }
                                    }
                                 } else {
                                    boolean var35 = false;
                                    boolean var46 = false;
                                    var25 = widget.itemIds[var22] - 1;
                                    if (var21 + 32 > var2 && var21 < var4 && var26 + 32 > var3 && var26 < var5 || widget == dragInventoryWidget && var22 == Client.dragItemSlotSource) {
                                       Sprite var42;
                                       if (Client.isItemSelected == 1 && var22 == HealthBarDefinition.selectedItemSlot && widget.id == ServerPacket.selectedItemWidget) {
                                          var42 = class226.getItemSprite(var25, widget.itemQuantities[var22], 2, 0, 2, false);
                                       } else {
                                          var42 = class226.getItemSprite(var25, widget.itemQuantities[var22], 1, 3153952, 2, false);
                                       }

                                       if (var42 != null) {
                                          if (widget == dragInventoryWidget && var22 == Client.dragItemSlotSource) {
                                             var33 = MouseHandler.MouseHandler_x - Client.field205;
                                             var24 = MouseHandler.MouseHandler_y - Client.field206;
                                             if (var33 < 5 && var33 > -5) {
                                                var33 = 0;
                                             }

                                             if (var24 < 5 && var24 > -5) {
                                                var24 = 0;
                                             }

                                             if (Client.itemDragDuration < 5) {
                                                var33 = 0;
                                                var24 = 0;
                                             }

                                             var42.method310(var21 + var33, var26 + var24, 128);
                                             if (var1 != -1) {
                                                Widget var47 = widgets[var1 & 65535];
                                                int var45;
                                                if (var26 + var24 < Rasterizer2D.Rasterizer2D_yClipStart && var47.scrollY > 0) {
                                                   var45 = (Rasterizer2D.Rasterizer2D_yClipStart - var26 - var24) * Client.field183 / 3;
                                                   if (var45 > Client.field183 * 10) {
                                                      var45 = Client.field183 * 10;
                                                   }

                                                   if (var45 > var47.scrollY) {
                                                      var45 = var47.scrollY;
                                                   }

                                                   var47.scrollY -= var45;
                                                   Client.field206 += var45;
                                                   WorldMapRectangle.method295(var47);
                                                }

                                                if (var24 + var26 + 32 > Rasterizer2D.Rasterizer2D_yClipEnd && var47.scrollY < var47.scrollHeight - var47.height) {
                                                   var45 = (var26 + var24 + 32 - Rasterizer2D.Rasterizer2D_yClipEnd) * Client.field183 / 3;
                                                   if (var45 > Client.field183 * 10) {
                                                      var45 = Client.field183 * 10;
                                                   }

                                                   if (var45 > var47.scrollHeight - var47.height - var47.scrollY) {
                                                      var45 = var47.scrollHeight - var47.height - var47.scrollY;
                                                   }

                                                   var47.scrollY += var45;
                                                   Client.field206 -= var45;
                                                   WorldMapRectangle.method295(var47);
                                                }
                                             }
                                          } else if (widget == BoundaryObject.field40 && var22 == Client.field204) {
                                             var42.method310(var21, var26, 128);
                                          } else {
                                             var42.drawAt2(var21, var26);
                                          }
                                       } else {
                                          WorldMapRectangle.method295(widget);
                                       }
                                    }
                                 }

                                 ++var22;
                              }
                           }
                        } else if (widget.type == 3) {
                           if (class238.runCs1(widget)) {
                              var22 = widget.color2;
                              if (widget == Clock.mousedOverWidgetIf1 && widget.mouseOverColor2 != 0) {
                                 var22 = widget.mouseOverColor2;
                              }
                           } else {
                              var22 = widget.color;
                              if (widget == Clock.mousedOverWidgetIf1 && widget.mouseOverColor != 0) {
                                 var22 = widget.mouseOverColor;
                              }
                           }

                           if (widget.fill) {
                              switch(widget.rectangleMode.id) {
                              case 1:
                                 Rasterizer2D.Rasterizer2D_drawGradient(x, y, widget.width, widget.height, widget.color, widget.color2);
                                 break;
                              case 2:
                                 Rasterizer2D.drawGradientAlpha(x, y, widget.width, widget.height, widget.color, widget.color2, 255 - (widget.transparency & 255), 255 - (widget.field960 & 255));
                                 break;
                              default:
                                 if (var14 == 0) {
                                    Rasterizer2D.Rasterizer2D_fillRectangle(x, y, widget.width, widget.height, var22);
                                 } else {
                                    Rasterizer2D.Rasterizer2D_fillRectangleAlpha(x, y, widget.width, widget.height, var22, 256 - (var14 & 255));
                                 }
                              }
                           } else if (var14 == 0) {
                              Rasterizer2D.Rasterizer2D_drawRectangle(x, y, widget.width, widget.height, var22);
                           } else {
                              Rasterizer2D.Rasterizer2D_drawRectangleAlpha(x, y, widget.width, widget.height, var22, 256 - (var14 & 255));
                           }
                        } else {
                           Font var27;
                           if (widget.type == 4) {
                              var27 = widget.getFont();
                              if (var27 == null) {
                                 if (Widget.field957) {
                                    WorldMapRectangle.method295(widget);
                                 }
                              } else {
                                 String var38 = widget.text;
                                 if (class238.runCs1(widget)) {
                                    var19 = widget.color2;
                                    if (widget == Clock.mousedOverWidgetIf1 && widget.mouseOverColor2 != 0) {
                                       var19 = widget.mouseOverColor2;
                                    }

                                    if (widget.text2.length() > 0) {
                                       var38 = widget.text2;
                                    }
                                 } else {
                                    var19 = widget.color;
                                    if (widget == Clock.mousedOverWidgetIf1 && widget.mouseOverColor != 0) {
                                       var19 = widget.mouseOverColor;
                                    }
                                 }

                                 if (widget.isIf3 && widget.itemId != -1) {
                                    ItemDefinition var41 = Skills.getItemDefinition(widget.itemId);
                                    var38 = var41.name;
                                    if (var38 == null) {
                                       var38 = "null";
                                    }

                                    if ((var41.isStackable == 1 || widget.itemQuantity != 1) && widget.itemQuantity != -1) {
                                       var38 = BufferedFile.colorStartTag(16748608) + var38 + "</col> " + 'x' + GrandExchangeEvent.method88(widget.itemQuantity);
                                    }
                                 }

                                 if (widget == Client.field127) {
                                    var38 = "Please wait...";
                                    var19 = widget.color;
                                 }

                                 if (!widget.isIf3) {
                                    var38 = MouseRecorder.method1194(var38, widget);
                                 }

                                 var27.drawLines(var38, x, y, widget.width, widget.height, var19, widget.textShadowed ? 0 : -1, widget.textXAlignment, widget.textYAlignment, widget.textLineHeight);
                              }
                           } else if (widget.type == 5) {
                              Sprite var37;
                              if (!widget.isIf3) {
                                 var37 = widget.getSprite(class238.runCs1(widget));
                                 if (var37 != null) {
                                    var37.drawAt2(x, y);
                                 } else if (Widget.field957) {
                                    WorldMapRectangle.method295(widget);
                                 }
                              } else {
                                 if (widget.itemId != -1) {
                                    var37 = class226.getItemSprite(widget.itemId, widget.itemQuantity, widget.outline, widget.spriteShadow, widget.itemQuantityMode, false);
                                 } else {
                                    var37 = widget.getSprite(false);
                                 }

                                 if (var37 == null) {
                                    if (Widget.field957) {
                                       WorldMapRectangle.method295(widget);
                                    }
                                 } else {
                                    var19 = var37.width;
                                    var20 = var37.height;
                                    if (!widget.spriteTiling) {
                                       var21 = widget.width * 4096 / var19;
                                       if (widget.spriteAngle != 0) {
                                          var37.method317(widget.width / 2 + x, widget.height / 2 + y, widget.spriteAngle, var21);
                                       } else if (var14 != 0) {
                                          var37.method311(x, y, widget.width, widget.height, 256 - (var14 & 255));
                                       } else if (var19 == widget.width && var20 == widget.height) {
                                          var37.drawAt2(x, y);
                                       } else {
                                          var37.method309(x, y, widget.width, widget.height);
                                       }
                                    } else {
                                       Rasterizer2D.Rasterizer2D_expandClip(x, y, x + widget.width, y + widget.height);
                                       var21 = (var19 - 1 + widget.width) / var19;
                                       var26 = (var20 - 1 + widget.height) / var20;

                                       for (var33 = 0; var33 < var21; ++var33) {
                                          for (var24 = 0; var24 < var26; ++var24) {
                                             if (widget.spriteAngle != 0) {
                                                var37.method317(var19 / 2 + x + var19 * var33, var20 / 2 + y + var24 * var20, widget.spriteAngle, 4096);
                                             } else if (var14 != 0) {
                                                var37.method310(x + var19 * var33, y + var20 * var24, 256 - (var14 & 255));
                                             } else {
                                                var37.drawAt2(x + var19 * var33, y + var24 * var20);
                                             }
                                          }
                                       }

                                       Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
                                    }
                                 }
                              }
                           } else {
                              ItemDefinition var28;
                              if (widget.type == 6) {
                                 boolean var40 = class238.runCs1(widget);
                                 if (var40) {
                                    var19 = widget.sequenceId2;
                                 } else {
                                    var19 = widget.sequenceId;
                                 }

                                 Model var43 = null;
                                 var21 = 0;
                                 if (widget.itemId != -1) {
                                    var28 = Skills.getItemDefinition(widget.itemId);
                                    if (var28 != null) {
                                       var28 = var28.getCountObj(widget.itemQuantity);
                                       var43 = var28.getModel(1);
                                       if (var43 != null) {
                                          var43.calculateBoundsCylinder();
                                          var21 = var43.height / 2;
                                       } else {
                                          WorldMapRectangle.method295(widget);
                                       }
                                    }
                                 } else if (widget.modelType == 5) {
                                    if (widget.modelId == 0) {
                                       var43 = Client.field119.getModel((SequenceDefinition)null, -1, (SequenceDefinition)null, -1);
                                    } else {
                                       var43 = Canvas.localPlayer.getModel();
                                    }
                                 } else if (var19 == -1) {
                                    var43 = widget.getModel((SequenceDefinition)null, -1, var40, Canvas.localPlayer.appearance);
                                    if (var43 == null && Widget.field957) {
                                       WorldMapRectangle.method295(widget);
                                    }
                                 } else {
                                    SequenceDefinition var44 = WorldMapAreaData.getSequenceDefinition(var19);
                                    var43 = widget.getModel(var44, widget.modelFrame, var40, Canvas.localPlayer.appearance);
                                    if (var43 == null && Widget.field957) {
                                       WorldMapRectangle.method295(widget);
                                    }
                                 }

                                 Rasterizer3D.method2989(widget.width / 2 + x, widget.height / 2 + y);
                                 var26 = Rasterizer3D.Rasterizer3D_sine[widget.modelAngleX] * widget.modelZoom >> 16;
                                 var33 = Rasterizer3D.Rasterizer3D_cosine[widget.modelAngleX] * widget.modelZoom >> 16;
                                 if (var43 != null) {
                                    if (!widget.isIf3) {
                                       var43.method199(0, widget.modelAngleY, 0, widget.modelAngleX, 0, var26, var33);
                                    } else {
                                       var43.calculateBoundsCylinder();
                                       if (widget.modelOrthog) {
                                          var43.method200(0, widget.modelAngleY, widget.modelAngleZ, widget.modelAngleX, widget.modelOffsetX, var21 + var26 + widget.modelOffsetY, var33 + widget.modelOffsetY, widget.modelZoom);
                                       } else {
                                          var43.method199(0, widget.modelAngleY, widget.modelAngleZ, widget.modelAngleX, widget.modelOffsetX, var26 + var21 + widget.modelOffsetY, var33 + widget.modelOffsetY);
                                       }
                                    }
                                 }

                                 Rasterizer3D.Rasterizer3D_method3();
                              } else {
                                 if (widget.type == 7) {
                                    var27 = widget.getFont();
                                    if (var27 == null) {
                                       if (Widget.field957) {
                                          WorldMapRectangle.method295(widget);
                                       }
                                       continue;
                                    }

                                    var19 = 0;

                                    for (var20 = 0; var20 < widget.rawHeight; ++var20) {
                                       for (var21 = 0; var21 < widget.rawWidth; ++var21) {
                                          if (widget.itemIds[var19] > 0) {
                                             var28 = Skills.getItemDefinition(widget.itemIds[var19] - 1);
                                             String var29;
                                             if (var28.isStackable != 1 && widget.itemQuantities[var19] == 1) {
                                                var29 = BufferedFile.colorStartTag(16748608) + var28.name + "</col>";
                                             } else {
                                                var29 = BufferedFile.colorStartTag(16748608) + var28.name + "</col> " + 'x' + GrandExchangeEvent.method88(widget.itemQuantities[var19]);
                                             }

                                             var24 = var21 * (widget.paddingX + 115) + x;
                                             var25 = var20 * (widget.paddingY + 12) + y;
                                             if (widget.textXAlignment == 0) {
                                                var27.draw(var29, var24, var25, widget.color, widget.textShadowed ? 0 : -1);
                                             } else if (widget.textXAlignment == 1) {
                                                var27.drawCentered(var29, widget.width / 2 + var24, var25, widget.color, widget.textShadowed ? 0 : -1);
                                             } else {
                                                var27.drawRightAligned(var29, var24 + widget.width - 1, var25, widget.color, widget.textShadowed ? 0 : -1);
                                             }
                                          }

                                          ++var19;
                                       }
                                    }
                                 }

                                 if (widget.type == 8 && widget == AccessFile.field8 && Client.field219 == Client.field218) {
                                    var22 = 0;
                                    var19 = 0;
                                    Font var39 = fontPlain12;
                                    String var30 = widget.text;

                                    String var31;
                                    for (var30 = MouseRecorder.method1194(var30, widget); var30.length() > 0; var19 = var19 + var39.ascent + 1) {
                                       var33 = var30.indexOf("<br>");
                                       if (var33 != -1) {
                                          var31 = var30.substring(0, var33);
                                          var30 = var30.substring(var33 + 4);
                                       } else {
                                          var31 = var30;
                                          var30 = "";
                                       }

                                       var24 = var39.stringWidth(var31);
                                       if (var24 > var22) {
                                          var22 = var24;
                                       }
                                    }

                                    var22 += 6;
                                    var19 += 7;
                                    var33 = x + widget.width - 5 - var22;
                                    var24 = y + widget.height + 5;
                                    if (var33 < x + 5) {
                                       var33 = x + 5;
                                    }

                                    if (var22 + var33 > var4) {
                                       var33 = var4 - var22;
                                    }

                                    if (var24 + var19 > var5) {
                                       var24 = var5 - var19;
                                    }

                                    Rasterizer2D.Rasterizer2D_fillRectangle(var33, var24, var22, var19, 16777120);
                                    Rasterizer2D.Rasterizer2D_drawRectangle(var33, var24, var22, var19, 0);
                                    var30 = widget.text;
                                    var25 = var24 + var39.ascent + 2;

                                    for (var30 = MouseRecorder.method1194(var30, widget); var30.length() > 0; var25 = var25 + var39.ascent + 1) {
                                       int var32 = var30.indexOf("<br>");
                                       if (var32 != -1) {
                                          var31 = var30.substring(0, var32);
                                          var30 = var30.substring(var32 + 4);
                                       } else {
                                          var31 = var30;
                                          var30 = "";
                                       }

                                       var39.draw(var31, var33 + 3, var25, 0, -1);
                                    }
                                 }

                                 if (widget.type == 9) {
                                    if (widget.field961) {
                                       var22 = x;
                                       var19 = y + widget.height;
                                       var20 = x + widget.width;
                                       var21 = y;
                                    } else {
                                       var22 = x;
                                       var19 = y;
                                       var20 = x + widget.width;
                                       var21 = y + widget.height;
                                    }

                                    if (widget.lineWid == 1) {
                                       Rasterizer2D.Rasterizer2D_drawLine(var22, var19, var20, var21, widget.color);
                                    } else {
                                       class190.method3669(var22, var19, var20, var21, widget.color, widget.lineWid);
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("jy")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1666917204"
   )
   static final void method845(int var0) {
      if (GroundItemPile.loadInterface(var0)) {
         Widget[] var1 = Widget.interfaceComponents[var0];

         for (int var2 = 0; var2 < var1.length; ++var2) {
            Widget var3 = var1[var2];
            if (var3 != null) {
               var3.modelFrame = 0;
               var3.modelFrameCycle = 0;
            }
         }
      }

   }
}
