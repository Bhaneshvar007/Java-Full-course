package com.java.VVVVVVVIMPPPP;
import java.util.*;
public class N_Queen_L_51 {
	
	public static boolean isSafe(int row,int col,char[][] board) {
		for(int i=0;i<board.length;i++) {
			if(board[row][i] == 'Q') {
				return false;
			}
		}
		for(int i=0;i<board.length;i++) {
			if(board[i][col] == 'Q') {
				return false;
			}
		}
		int r=row;
		for(int c=col;c>=0 && r>=0;r--,c--) {
			if(board[r][c] == 'Q') {
				return false;
			}
		}
		 r = row;
		for(int c=col;c>=0 && r<board.length;r++,c--) {
			if(board[r][c] == 'Q') {
				return false;
			}
		}
		r = row;
		for(int c=col;c<board.length && r>=0;r--,c++) {
			if(board[r][c] == 'Q') {
				return false;
			}
		}
		r = row;
		for(int c=col;c<board.length && r<board.length;r++,c++) {
			if(board[r][c] == 'Q') {
				return false;
			}
		}
		
		return true;
	}
	
	public static void saveBoard(char[][] board , ArrayList<ArrayList<String>> allBoard) {
		String row="";
		ArrayList<String> newBoard = new ArrayList<>();
		
		for(int i=0;i<board.length;i++) {
			row="";
			for(int j=0;j<board.length;j++) {
				if(board[i][j]=='Q') {
					row+='Q';
				}
				else {
					row+='_';
				}
			}
			newBoard.add(row);
		}
		allBoard.add(newBoard);
	}
	
	public static void helper(char[][] board , ArrayList<ArrayList<String>> allBoard, int col) {
		if(col == board.length) {
			saveBoard(board,allBoard);
			return;
		}
		
		for(int row=0;row<board.length;row++) {
			
			if(isSafe(row,col,board)) {
				board[row][col] = 'Q';
				helper(board,allBoard,col+1);
				board[row][col] = '_';
			}
		}
	}
	
 
public static ArrayList<ArrayList<String>> N_Queen(int n){
	ArrayList<ArrayList<String>> allBoard = new ArrayList<>();
	char[][] board = new char[n][n];
	helper(board , allBoard,0);
	return allBoard;
}
}
