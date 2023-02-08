package Leetcode;

//   1779. Find the Nearest Point That Has the Same X or Y Coordinate

public class Nearest_Point {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int distance = 0, index = -1;
        int min_distance = Integer.MAX_VALUE;

        for(int i=0; i<points.length; i++){

            if((points[i][0]==x || points[i][1]==y)){
                distance=Math.abs(x-points[i][0]+ Math.abs(y-points[i][1]));
                if(min_distance>distance){
                    min_distance = distance;
                    index =i;
                }
            }
        }
          System.out.println(index);
        return index;
    }

    public static void main(String[] args) {
        int a=3,b=4;
        int [][] arr = {{2,4},{2,5},{6,3},{5,6}};
        Nearest_Point near = new Nearest_Point();
        near.nearestValidPoint(a,b,arr);
    }
}
