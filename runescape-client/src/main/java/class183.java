import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("gx")
public class class183 {
   @ObfuscatedName("i")
   public static void method3509(byte[] var0, int var1, byte[] var2, int var3, int var4) {
      if(var0 == var2) {
         if(var1 == var3) {
            return;
         }

         if(var3 > var1 && var3 < var1 + var4) {
            --var4;
            var1 += var4;
            var3 += var4;
            var4 = var1 - var4;

            for(var4 += 7; var1 >= var4; var2[var3--] = var0[var1--]) {
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
            }

            for(var4 -= 7; var1 >= var4; var2[var3--] = var0[var1--]) {
               ;
            }

            return;
         }
      }

      var4 += var1;

      for(var4 -= 7; var1 < var4; var2[var3++] = var0[var1++]) {
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
      }

      for(var4 += 7; var1 < var4; var2[var3++] = var0[var1++]) {
         ;
      }

   }

   @ObfuscatedName("a")
   public static void method3518(int[] var0, int var1, int var2) {
      for(var2 = var1 + var2 - 7; var1 < var2; var0[var1++] = 0) {
         var0[var1++] = 0;
         var0[var1++] = 0;
         var0[var1++] = 0;
         var0[var1++] = 0;
         var0[var1++] = 0;
         var0[var1++] = 0;
         var0[var1++] = 0;
      }

      for(var2 += 7; var1 < var2; var0[var1++] = 0) {
         ;
      }

   }
}