package com.ifreeky.learn.exc.dp;

/**
 *
 * @author teng.dang
 * @since 02 十一月 2020
 */
public class MinDistance {

	public int solution(String str1, String str2) {
		if (str1 == null || str2 == null) {
			return str1 == null ? (str2 == null ? 0 : str2.length()) : str1.length();
		}
		int n = str1.length();
		int m = str2.length();
		if (n == 0 || m == 0) {
			return Math.max(n, m);
		}
		int[][] dp = new int[n + 1][m + 1];
		for (int i = 0; i <= n; i++) {
			dp[i][0] = i;
		}
		for (int j = 0; j <= m; j++) {
			dp[0][j] = j;
		}

		for (int i = 1; i < n + 1; i++) {
			for (int j = 1; j < m + 1; j++) {
				int add = dp[i - 1][j] + 1;
				int delete = dp[i][j - 1] + 1;
				int change = dp[i - 1][j - 1];
				if (str1.charAt(i - 1) != str2.charAt(j - 1)) {
					change++;
				}
				dp[i][j] = Math.min(add, Math.min(delete, change));
			}
		}
		return dp[n][m];
	}


	public static void main(String[] args) {
		MinDistance minDistance = new MinDistance();
		System.out.println(minDistance.solution("intention", "execution"));
	}
}
