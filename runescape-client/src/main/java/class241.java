import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("iu")
public class class241 extends CacheableNode {
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -1907162723
   )
   public static int field3292;
   @ObfuscatedName("p")
   public static IndexDataBase field3293;
   @ObfuscatedName("e")
   public static NodeCache field3294;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = 1824136911
   )
   public int field3295;

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(LBuffer;B)V",
      garbageValue = "89"
   )
   void method4159(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if(var2 == 0) {
            return;
         }

         this.method4165(var1, var2);
      }
   }

   class241() {
      this.field3295 = 0;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(LBuffer;II)V",
      garbageValue = "-1612025359"
   )
   void method4165(Buffer var1, int var2) {
      if(var2 == 5) {
         this.field3295 = var1.readUnsignedShort();
      }

   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;II[BII)I",
      garbageValue = "2060708096"
   )
   public static int method4166(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
      int var5 = var2 - var1;

      for(int var6 = 0; var6 < var5; ++var6) {
         char var7 = var0.charAt(var6 + var1);
         if((var7 <= 0 || var7 >= 128) && (var7 < 160 || var7 > 255)) {
            if(var7 == 8364) {
               var3[var6 + var4] = -128;
            } else if(var7 == 8218) {
               var3[var6 + var4] = -126;
            } else if(var7 == 402) {
               var3[var4 + var6] = -125;
            } else if(var7 == 8222) {
               var3[var6 + var4] = -124;
            } else if(var7 == 8230) {
               var3[var6 + var4] = -123;
            } else if(var7 == 8224) {
               var3[var6 + var4] = -122;
            } else if(var7 == 8225) {
               var3[var4 + var6] = -121;
            } else if(var7 == 710) {
               var3[var4 + var6] = -120;
            } else if(var7 == 8240) {
               var3[var4 + var6] = -119;
            } else if(var7 == 352) {
               var3[var4 + var6] = -118;
            } else if(var7 == 8249) {
               var3[var6 + var4] = -117;
            } else if(var7 == 338) {
               var3[var4 + var6] = -116;
            } else if(var7 == 381) {
               var3[var4 + var6] = -114;
            } else if(var7 == 8216) {
               var3[var4 + var6] = -111;
            } else if(var7 == 8217) {
               var3[var4 + var6] = -110;
            } else if(var7 == 8220) {
               var3[var6 + var4] = -109;
            } else if(var7 == 8221) {
               var3[var4 + var6] = -108;
            } else if(var7 == 8226) {
               var3[var4 + var6] = -107;
            } else if(var7 == 8211) {
               var3[var4 + var6] = -106;
            } else if(var7 == 8212) {
               var3[var6 + var4] = -105;
            } else if(var7 == 732) {
               var3[var6 + var4] = -104;
            } else if(var7 == 8482) {
               var3[var6 + var4] = -103;
            } else if(var7 == 353) {
               var3[var6 + var4] = -102;
            } else if(var7 == 8250) {
               var3[var4 + var6] = -101;
            } else if(var7 == 339) {
               var3[var6 + var4] = -100;
            } else if(var7 == 382) {
               var3[var4 + var6] = -98;
            } else if(var7 == 376) {
               var3[var4 + var6] = -97;
            } else {
               var3[var6 + var4] = 63;
            }
         } else {
            var3[var4 + var6] = (byte)var7;
         }
      }

      return var5;
   }

   @ObfuscatedName("fm")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "319093460"
   )
   @Export("getResizableValue")
   static int getResizableValue() {
      return Client.isResized?2:1;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(LPacketBuffer;I)V",
      garbageValue = "-1741425124"
   )
   public static void method4168(PacketBuffer var0) {
      ClassInfo var1 = (ClassInfo)class280.field3749.method3457();
      if(var1 != null) {
         int var2 = var0.offset;
         var0.putInt(var1.field3741);

         for(int var3 = 0; var3 < var1.field3743; ++var3) {
            if(var1.field3744[var3] != 0) {
               var0.putByte(var1.field3744[var3]);
            } else {
               try {
                  int var4 = var1.field3748[var3];
                  Field var5;
                  int var6;
                  if(var4 == 0) {
                     var5 = var1.fields[var3];
                     var6 = Reflection.getInt(var5, (Object)null);
                     var0.putByte(0);
                     var0.putInt(var6);
                  } else if(var4 == 1) {
                     var5 = var1.fields[var3];
                     Reflection.setInt(var5, (Object)null, var1.field3746[var3]);
                     var0.putByte(0);
                  } else if(var4 == 2) {
                     var5 = var1.fields[var3];
                     var6 = var5.getModifiers();
                     var0.putByte(0);
                     var0.putInt(var6);
                  }

                  Method var7;
                  if(var4 != 3) {
                     if(var4 == 4) {
                        var7 = var1.methods[var3];
                        var6 = var7.getModifiers();
                        var0.putByte(0);
                        var0.putInt(var6);
                     }
                  } else {
                     var7 = var1.methods[var3];
                     byte[][] var8 = var1.args[var3];
                     Object[] var9 = new Object[var8.length];

                     for(int var10 = 0; var10 < var8.length; ++var10) {
                        ObjectInputStream var11 = new ObjectInputStream(new ByteArrayInputStream(var8[var10]));
                        var9[var10] = var11.readObject();
                     }

                     Object var24 = Reflection.invoke(var7, (Object)null, var9);
                     if(var24 == null) {
                        var0.putByte(0);
                     } else if(var24 instanceof Number) {
                        var0.putByte(1);
                        var0.putLong(((Number)var24).longValue());
                     } else if(var24 instanceof String) {
                        var0.putByte(2);
                        var0.method3125((String)var24);
                     } else {
                        var0.putByte(4);
                     }
                  }
               } catch (ClassNotFoundException var12) {
                  var0.putByte(-10);
               } catch (InvalidClassException var13) {
                  var0.putByte(-11);
               } catch (StreamCorruptedException var14) {
                  var0.putByte(-12);
               } catch (OptionalDataException var15) {
                  var0.putByte(-13);
               } catch (IllegalAccessException var16) {
                  var0.putByte(-14);
               } catch (IllegalArgumentException var17) {
                  var0.putByte(-15);
               } catch (InvocationTargetException var18) {
                  var0.putByte(-16);
               } catch (SecurityException var19) {
                  var0.putByte(-17);
               } catch (IOException var20) {
                  var0.putByte(-18);
               } catch (NullPointerException var21) {
                  var0.putByte(-19);
               } catch (Exception var22) {
                  var0.putByte(-20);
               } catch (Throwable var23) {
                  var0.putByte(-21);
               }
            }
         }

         var0.method3112(var2);
         var1.unlink();
      }

   }

   static {
      field3294 = new NodeCache(64);
   }
}