class Solution:
    def subtractProductAndSum(self, n):

        total = 0
        product = 1

        while n > 0:
            digit = n % 10

            total = total + digit
            product = product * digit

            n = n // 10

        return product - total