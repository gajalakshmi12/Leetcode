import math

class Solution(object):
    def isPowerOfThree(self, n):
        if n <= 0:
            return False

        max_int = 2**31 - 1          # allowed LeetCode range
        k = int(math.log(max_int, 3))  # biggest exponent that fits
        max_power = 3 ** k             # largest power of 3 within range

        return max_power % n == 0
