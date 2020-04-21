package nam.test;

import static org.junit.Assert.*;

import java.util.Vector;

import org.junit.Test;

public class BingoTest {

	 // 2차원 배열 arr의 빙고 갯수를 세어서 반환. 아래의 메서드를 완성하고 테스트하시오.
	public int bingoCheck(int[][] arr) {
		
	  // 2차원 배열 arr에서 빙고갯수cnt를 센다.
	  int cnt = 0;

	
	  int sum_hang=0;
	
	  for(int i=0;i<arr.length;i++) {//같은 행에서
		sum_hang=0;
		for(int j=0;j<arr[i].length;j++) {
		  sum_hang+=arr[i][j];  
	  } 
	  
	  if(sum_hang==0||sum_hang==5)cnt++;
		  
	  }
	
	  int sum_yeol=0;
		
	  for(int i=0;i<arr.length;i++) {//같은 열에서
		sum_hang=0;
		for(int j=0;j<arr[i].length;j++) {
			  sum_hang+=arr[j][i];  
		  } 
		  
		  if(sum_yeol==0||sum_yeol==5)cnt++;
			  
	  }
	  
	  int sum_oh=0;//오른쪽 대각선
	  for(int m=0;m<arr.length;m++) {
		  sum_oh+=arr[m][m];
	  }
	  
	  if(sum_oh==5||sum_oh==0)
	  cnt++;
	  
	  int sum_wn=0;//왼쪽 대각선
	  for(int m=0;m<arr.length;m++) {
		  sum_oh+=arr[m][4-m];
	  }
	  
	  if(sum_oh==5||sum_oh==0)
	  cnt++;
	  
	  
	  return cnt;
	 }

	 @Test
	 public void test4() {
	  int[][] arr = {
	    {1,1,1,1,1},
	    {1,1,0,0,0},
	    {1,0,1,0,0},
	    {1,0,0,1,0},
	    {1,0,0,0,1},
	  };
	  
	  System.out.println(bingoCheck(arr));
	  assertTrue(bingoCheck(arr)==3);
	 }
	 
	 
	 @Test
	 public void test3() {
	  int[][] arr = {
	    {1,1,1,1,1},
	    {1,0,0,0,0},
	    {1,0,0,0,0},
	    {1,0,0,0,0},
	    {1,0,0,0,0},
	  };

	  System.out.println(bingoCheck(arr));
	  assertTrue(bingoCheck(arr)==2);
	 }
	 
	 
	 @Test
	 public void test2() {
	  int[][] arr = {
	    {1,1,1,1,1},
	    {0,0,0,0,0},
	    {0,0,0,0,0},
	    {0,0,0,0,0},
	    {0,0,0,0,0},
	  };

	  System.out.println(bingoCheck(arr));
	  assertTrue(bingoCheck(arr)==1);
	 }

	 @Test
	 public void test() {
	  int[][] arr = {
	    {1,1,1,1,1},
	    {1,1,1,1,1},
	    {1,1,1,1,1},
	    {1,1,1,1,1},
	    {1,1,1,1,1},
	  };

	  System.out.println(bingoCheck(arr));
	  assertTrue(bingoCheck(arr)==12);
	 }
	 

	}

