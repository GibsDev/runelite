import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("gu")
public class class187 {
   @ObfuscatedName("i")
   int[] field2463;

   public class187(int[] var1) {
      int var2;
      for(var2 = 1; var2 <= var1.length + (var1.length >> 1); var2 <<= 1) {
         ;
      }

      this.field2463 = new int[var2 + var2];

      int var3;
      for(var3 = 0; var3 < var2 + var2; ++var3) {
         this.field2463[var3] = -1;
      }

      int var4;
      for(var3 = 0; var3 < var1.length; this.field2463[var4 + var4 + 1] = var3++) {
         for(var4 = var1[var3] & var2 - 1; this.field2463[var4 + var4 + 1] != -1; var4 = var4 + 1 & var2 - 1) {
            ;
         }

         this.field2463[var4 + var4] = var1[var3];
      }

   }

   @ObfuscatedName("i")
   public int method3493(int var1) {
      int var2 = (this.field2463.length >> 1) - 1;
      int var3 = var1 & var2;

      while(true) {
         int var4 = this.field2463[var3 + var3 + 1];
         if(var4 == -1) {
            return -1;
         }

         if(this.field2463[var3 + var3] == var1) {
            return var4;
         }

         var3 = var3 + 1 & var2;
      }
   }
}