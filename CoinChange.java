package SOTI_probs;

//CoinChange Using Recurion - Leetcode 322
//Time Limit Exceed in LC

public class CoinChange {
        public int coinChangeRecursive(int[] coins, int amount) {
            if (amount == 0) return 0;
            int minCoins = Integer.MAX_VALUE;
            for (int coin : coins) {
                if (amount - coin >= 0) {
                    int res = coinChangeRecursive(coins, amount - coin);
                    if (res >= 0 && res < minCoins) minCoins = 1 + res;
                }
            }
            return minCoins == Integer.MAX_VALUE ? -1 : minCoins;
        }
        public static void main(String[] args) {
            CoinChange solution = new CoinChange();
            int[] coins = {1, 2, 5};
            int amount = 11;
            int result = solution.coinChangeRecursive(coins, amount);
            System.out.println("Minimum coins required: " + result);
        }
    }

