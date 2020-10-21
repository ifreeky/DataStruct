package com.ifreeky.learn.exc.dp;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author teng.dang
 * @since 21 十月 2020
 */
public class TriangleRouteSum {

	public int routeSum(int[][] triangle) {
		Map<String, Integer> map = new HashMap<>();
		return traverse(0, 0, triangle, map) + triangle[0][0];
	}

	public int traverse(int i, int j, int[][] triangle, Map<String, Integer> map) {
		String key = i + "-" + j;
		if (map.get(key) != null) {
			return map.get(key);
		}

		if (i >= triangle.length - 1) {
			return 0;
		}
		int leftSum = traverse(i + 1, j, triangle, map) + triangle[i + 1][j];
		int rightSum = traverse(i + 1, j + 1, triangle,map) + triangle[i + 1][j + 1];
		final int result = Math.min(leftSum, rightSum);
		map.put(key, result);
		return result;
	}

	public static void main(String[] args) {
		TriangleRouteSum triangleRouteSum = new TriangleRouteSum();
		int[][] triangle = {
				{2, 0, 0, 0},
				{3, 4, 0, 0},
				{6, 5, 7, 0},
				{4, 1, 8, 3}
		};
		System.out.println(triangleRouteSum.routeSum(triangle));
	}
}
