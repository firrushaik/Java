Q) Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.


plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]

Ans:

public int[] plusTwo(int[] a, int[] b) {
  int[] newArr = new int[4];
  newArr[0] = a[0];
  newArr[1] = a[1];
  newArr[2] = b[0];
  newArr[3] = b[1];
  
  return newArr;
}

Output:

plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]	[1, 2, 3, 4]	OK	
plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]	[4, 4, 2, 2]	OK	
plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]	[9, 2, 3, 4]	OK	
