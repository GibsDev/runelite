import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ej")
public class class130 extends Node {
   @ObfuscatedName("b")
   int field1888;
   @ObfuscatedName("q")
   boolean field1890;
   @ObfuscatedName("y")
   boolean field1893;
   @ObfuscatedName("h")
   int[] field1894;
   @ObfuscatedName("f")
   int[] field1896;
   @ObfuscatedName("n")
   int[] field1897;
   @ObfuscatedName("a")
   int field1898;
   @ObfuscatedName("o")
   int field1899;
   @ObfuscatedName("j")
   static int[] field1900;
   @ObfuscatedName("z")
   int[] field1901;
   @ObfuscatedName("x")
   int[] field1902;

   @ObfuscatedName("i")
   boolean method2480(double var1, int var3, IndexDataBase var4) {
      int var5;
      for(var5 = 0; var5 < this.field1894.length; ++var5) {
         if(var4.method4117(this.field1894[var5]) == null) {
            return false;
         }
      }

      var5 = var3 * var3;
      this.field1901 = new int[var5];

      for(int var6 = 0; var6 < this.field1894.length; ++var6) {
         int var8 = this.field1894[var6];
         ModIcon var7;
         if(!NPC.method1694(var4, var8)) {
            var7 = null;
         } else {
            ModIcon var10 = new ModIcon();
            var10.width = class286.field3790;
            var10.originalHeight = class286.field3792;
            var10.offsetX = class286.field3793[0];
            var10.offsetY = class266.field3657[0];
            var10.originalWidth = class233.field3205[0];
            var10.height = ScriptState.field779[0];
            var10.palette = class4.field33;
            var10.pixels = IndexFile.field2307[0];
            class251.method4451();
            var7 = var10;
         }

         var7.method5033();
         byte[] var17 = var7.pixels;
         int[] var11 = var7.palette;
         int var12 = this.field1897[var6];
         if((var12 & -16777216) == 16777216) {
            ;
         }

         if((var12 & -16777216) == 33554432) {
            ;
         }

         int var13;
         int var14;
         int var15;
         int var16;
         if((var12 & -16777216) == 50331648) {
            var13 = var12 & 16711935;
            var14 = var12 >> 8 & 255;

            for(var15 = 0; var15 < var11.length; ++var15) {
               var16 = var11[var15];
               if((var16 & '\uffff') == var16 >> 8) {
                  var16 &= 255;
                  var11[var15] = var13 * var16 >> 8 & 16711935 | var14 * var16 & '\uff00';
               }
            }
         }

         for(var13 = 0; var13 < var11.length; ++var13) {
            var11[var13] = class136.method2597(var11[var13], var1);
         }

         if(var6 == 0) {
            var13 = 0;
         } else {
            var13 = this.field1902[var6 - 1];
         }

         if(var13 == 0) {
            if(var7.originalWidth == var3) {
               for(var14 = 0; var14 < var5; ++var14) {
                  this.field1901[var14] = var11[var17[var14] & 255];
               }
            } else if(var7.originalWidth == 64 && var3 == 128) {
               var14 = 0;

               for(var15 = 0; var15 < var3; ++var15) {
                  for(var16 = 0; var16 < var3; ++var16) {
                     this.field1901[var14++] = var11[var17[(var16 >> 1) + (var15 >> 1 << 6)] & 255];
                  }
               }
            } else {
               if(var7.originalWidth != 128 || var3 != 64) {
                  throw new RuntimeException();
               }

               var14 = 0;

               for(var15 = 0; var15 < var3; ++var15) {
                  for(var16 = 0; var16 < var3; ++var16) {
                     this.field1901[var14++] = var11[var17[(var16 << 1) + (var15 << 1 << 7)] & 255];
                  }
               }
            }
         }

         if(var13 == 1) {
            ;
         }

         if(var13 == 2) {
            ;
         }

         if(var13 == 3) {
            ;
         }
      }

      return true;
   }

   @ObfuscatedName("c")
   void method2481() {
      this.field1901 = null;
   }

   class130(Buffer var1) {
      this.field1890 = false;
      this.field1888 = var1.readUnsignedShort();
      this.field1893 = var1.readUnsignedByte() == 1;
      int var2 = var1.readUnsignedByte();
      if(var2 >= 1 && var2 <= 4) {
         this.field1894 = new int[var2];

         int var3;
         for(var3 = 0; var3 < var2; ++var3) {
            this.field1894[var3] = var1.readUnsignedShort();
         }

         if(var2 > 1) {
            this.field1902 = new int[var2 - 1];

            for(var3 = 0; var3 < var2 - 1; ++var3) {
               this.field1902[var3] = var1.readUnsignedByte();
            }
         }

         if(var2 > 1) {
            this.field1896 = new int[var2 - 1];

            for(var3 = 0; var3 < var2 - 1; ++var3) {
               this.field1896[var3] = var1.readUnsignedByte();
            }
         }

         this.field1897 = new int[var2];

         for(var3 = 0; var3 < var2; ++var3) {
            this.field1897[var3] = var1.readInt();
         }

         this.field1898 = var1.readUnsignedByte();
         this.field1899 = var1.readUnsignedByte();
         this.field1901 = null;
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedName("e")
   void method2487(int var1) {
      if(this.field1901 != null) {
         short var2;
         int var3;
         int var4;
         int var5;
         int[] var6;
         int var7;
         int var10;
         if(this.field1898 == 1 || this.field1898 == 3) {
            if(field1900 == null || field1900.length < this.field1901.length) {
               field1900 = new int[this.field1901.length];
            }

            if(this.field1901.length == 4096) {
               var2 = 64;
            } else {
               var2 = 128;
            }

            var3 = this.field1901.length;
            var4 = var2 * var1 * this.field1899;
            var5 = var3 - 1;
            if(this.field1898 == 1) {
               var4 = -var4;
            }

            for(var10 = 0; var10 < var3; ++var10) {
               var7 = var10 + var4 & var5;
               field1900[var10] = this.field1901[var7];
            }

            var6 = this.field1901;
            this.field1901 = field1900;
            field1900 = var6;
         }

         if(this.field1898 == 2 || this.field1898 == 4) {
            if(field1900 == null || field1900.length < this.field1901.length) {
               field1900 = new int[this.field1901.length];
            }

            if(this.field1901.length == 4096) {
               var2 = 64;
            } else {
               var2 = 128;
            }

            var3 = this.field1901.length;
            var4 = var1 * this.field1899;
            var5 = var2 - 1;
            if(this.field1898 == 2) {
               var4 = -var4;
            }

            for(var10 = 0; var10 < var3; var10 += var2) {
               for(var7 = 0; var7 < var2; ++var7) {
                  int var8 = var10 + var7;
                  int var9 = var10 + (var7 + var4 & var5);
                  field1900[var8] = this.field1901[var9];
               }
            }

            var6 = this.field1901;
            this.field1901 = field1900;
            field1900 = var6;
         }

      }
   }
}