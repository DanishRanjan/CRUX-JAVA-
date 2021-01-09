package HackerBlocks;

import java.util.Scanner;

public class Sudoky_Solver {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] grid = new int[n][n];
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				grid[i][j] = in.nextInt();
			}
		}
		boolean[] isplaced = new boolean[n];
		Sudoku(isplaced, grid, 0, 0, n);

	}

	public static void Sudoku(boolean[] arr, int[][] grid, int cr, int cc, int n) {
		if (cc == n) {
			cr++;
			cc = 0;
		}
		if (cr == n) {
			display(grid);
			System.out.println();
			return;
		}
		if (grid[cr][cc] == 0) {
			for (int i = 0; i <= n; i++) {
				if (isitpossible(i, grid, cr, cc)) {
					grid[cr][cc] = i;
					Sudoku(arr, grid, cr, cc + 1, n);
					grid[cr][cc] = 0;
				}
			}

		} else {
			Sudoku(arr, grid, cr, cc + 1, n);
		}
	}

	public static void display(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static boolean isitpossible(int count, int[][] arr, int row, int col) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i][col] == count) {
				return false;
			}
		}
		for (int i = 0; i < arr[0].length; i++) {
			if (arr[row][i] == count) {
				return false;
			}
		}
		int maxrow;
		int minrow;
		int maxcol;
		int mincol;
		if(row%3==0) {
			minrow = row;
			maxrow = row+2;
		}else if(row%3==1){
			minrow = row-1;
			maxrow = row+1;
		} else {
			minrow = row-2;
			maxrow = row;
		}
		if(col%3==0) {
			mincol = col;
			maxcol = col+2;
		}else if(col%3==1){
			mincol = col-1;
			maxcol = col+1;
		} else {
			mincol = col-2;
			maxcol = col;
		}
		for(int i = minrow ; i<=maxrow ; i++) {
			for(int j = mincol ; j<=maxcol ; j++) {
				if(arr[i][j]==count) {
					return false;
				}
			}
		}
		
		
		return true;

	}
}
