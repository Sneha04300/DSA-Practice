class Solution:
    def isSameAfterReversals(self, num):

        original = num

        reverse = 0

        while num > 0:
            digit = num % 10
            reverse = reverse * 10 + digit
            num = num // 10

        doubleReverse = 0

        while reverse > 0:
            digit = reverse % 10
            doubleReverse = doubleReverse * 10 + digit
            reverse = reverse // 10

        return original == doubleReverse