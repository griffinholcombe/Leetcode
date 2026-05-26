// Last updated: 5/26/2026, 11:18:06 AM
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        //the pixel is already the changed color
        if (image[sr][sc] == color) return image;
        //start filling in starting position
        fill(image, sr, sc, color, image[sr][sc]);
        return image;  
    }


    public void fill(int[][] image, int sr, int sc, int color, int cur) {
        // check if either direction will take it out of bounds 
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length){
            return;
        }
        //check if the color in the block is correct
        if (cur != image[sr][sc]) {
            return;
        }
        image[sr][sc] = color;
        //fill in west of start
        fill(image, sr-1, sc, color, cur);
        //fill in east of start
        fill(image, sr+1, sc, color, cur);
        //fill in north of start
        fill(image, sr, sc-1, color, cur);
        //fill in south of start
        fill(image, sr, sc+1, color, cur);
    }
}