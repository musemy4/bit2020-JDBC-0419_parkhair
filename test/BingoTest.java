package nam.test;

import static org.junit.Assert.*;

import java.util.Vector;

import org.junit.Test;

public class BingoTest {

	 // 2���� �迭 arr�� ���� ������ ��� ��ȯ. �Ʒ��� �޼��带 �ϼ��ϰ� �׽�Ʈ�Ͻÿ�.
	public int bingoCheck(int[][] arr) {
		
	  // 2���� �迭 arr���� ������cnt�� ����.
	  int cnt = 0;

	
	  int sum_hang=0;
	
	  for(int i=0;i<arr.length;i++) {//���� �࿡��
		sum_hang=0;
		for(int j=0;j<arr[i].length;j++) {
		  sum_hang+=arr[i][j];  
	  } 
	  
	  if(sum_hang==0||sum_hang==5)cnt++;
		  
	  }
	
	  int sum_yeol=0;
		
	  for(int i=0;i<arr.length;i++) {//���� ������
		sum_hang=0;
		for(int j=0;j<arr[i].length;j++) {
			  sum_hang+=arr[j][i];  
		  } 
		  
		  if(sum_yeol==0||sum_yeol==5)cnt++;
			  
	  }
	  
	  int sum_oh=0;//������ �밢��
	  for(int m=0;m<arr.length;m++) {
		  sum_oh+=arr[m][m];
	  }
	  
	  if(sum_oh==5||sum_oh==0)
	  cnt++;
	  
	  int sum_wn=0;//���� �밢��
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

