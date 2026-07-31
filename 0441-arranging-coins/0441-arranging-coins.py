class Solution:
    def arrangeCoins(self, n):

        row = 1
        count = 0

        while n >= row:

            n = n - row
            count = count + 1
            row = row + 1

        return count       