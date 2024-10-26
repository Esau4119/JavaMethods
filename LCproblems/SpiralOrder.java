/*
	Esau B Medina 
		problem: Given a mxn matrix return the elements in a spiral order; 
		input: matrix with varing widths 
			output: list with the integers in that spiral order. 
OK so first I want to set up a few variables that would allow me to switch actions in my traversal loop. They are going to manage the direction of where we go for the spiral. We can then save those integers into a new list. 	
* /
import java.util.List; 
import java.util.ArrayList; 
class Solution {
	public List<Integer> spiralOrder( int[][] matrix ){
    		 if (matrix.length == 0) return new ArrayList<>();
		List <Integer> spiralElems = new ArrayList<>();
		int up = 0; 
		int right = 1;
		int down = 2; 
		int left = 3; 
		int upWall = 0; 
		int rightWall = matrix[0].length; 
		int downWall = matrix.length;
		int leftWall = -1; 
		int switchDir = right;
		int i =0, j = 0; 
		// while we dont have the length and height of the matix
		while(spiralElems.size() != matrix.length * matrix[0].length){
			if (switchDir == right){
				while(j< rightWall) {
					spiralElems.add(matrix[i][j]);
						j++; 
				}	
				i++;
				j--;
				rightWall--;
				switchDir = down; 
			}else if(switchDir ==  down){
				while(i< downWall) {
					spiralElems.add(matrix[i][j]);
						i++; 
				}
				i--;
				j--;
				downWall--;
				switchDir = left;
			}else if(switchDir ==  left){
				while(j> leftWall) {
					spiralElems.add(matrix[i][j]);
						j--; 
				}
				i--;
				j++;
				leftWall++;
				switchDir = up;
			}else if(switchDir ==  up){
				while(i>upWall) {
					spiralElems.add(matrix[i][j]);
						i--; 
				}
				i++;
				j++;
				upWall++;
				switchDir = right;
			}		
		} 
		return spiralElems; 	
	}

}
