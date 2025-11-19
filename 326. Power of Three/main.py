class Solution(object):
    def isPowerOfThree(self, n):
        """
        :type n: int
        :rtype: bool
        """
        return self.checkPowerOfThree(n)

    def checkPowerOfThree(self, n):
        if n <= 0:
            return False
        if n == 1:
            return True
        if n%3 != 0:
            return False    
        return self.checkPowerOfThree(n//3)
