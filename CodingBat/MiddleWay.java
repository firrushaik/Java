Q) Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.


middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]

Ans:

public int[] middleWay(int[] a, int[] b) {
  int[] newArr = new int[2];
  newArr[0] = a[1];
  newArr[1] = b[1];
  return newArr;
}


Output:

middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]	[2, 5]	OK	
middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]	[7, 8]	OK	
middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]	[2, 4]	OK	
middleWay([1, 9, 7], [4, 8, 8]) → [9, 8]	[9, 8]	OK	
middleWay([1, 2, 3], [3, 1, 4]) → [2, 1]	[2, 1]	OK	
middleWay([1, 2, 3], [4, 1, 1]) → [2, 1]	[2, 1]	OK	