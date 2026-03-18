class Solution{
   public boolean isPowerOfFour(int n) {
    if (n <= 0) return false;

    // Check power of 2
    if ((n & (n - 1)) != 0) return false;

    // Check if the 1-bit is in even position
    return (n & 0x55555555) != 0;
}
}
