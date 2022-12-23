package rick.Recursion;

import rick.utilities.UFeatures;

import java.awt.*;
import java.security.cert.CertPath;
import java.util.ArrayList;

public class MazeSolver {
    public static void main(String[] args) {
        int n = UFeatures.inInt("Enter the size of the maze");
        int[][] m = new int[n][n];
        for (int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                m[i][j] = UFeatures.inInt("Enter the blockage for row "+(i+1)+" column "+(j+1));
            }
        }
        int[][] visited = new int[n][n];
        for (int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                visited[i][j] = 0;
            }
        }
        ArrayList<String> ans = new ArrayList<>();
        StringBuilder path = new StringBuilder();
        if(m[0][0] == 0)
            System.out.println("-1");

        solve(ans, m, visited, 0, 0, path, n);
        for (int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(m[i][j] + ", ");
            }
            System.out.println();
        }
        System.out.println(ans);
    }
    public static boolean isSafe(int[][] m, int[][] visited, int x, int y, int n){
        return x >= 0 && x < n && y >= 0 && y < n && visited[x][y] == 0 && m[x][y] == 1;
    }
    public static void solve(ArrayList<String> ans, int[][] m, int[][] visited, int x, int y, StringBuilder path, int n){
        //base case
        if(x == n - 1 && y == n -1){
            ans.add(path.toString());
            return;
        }
        visited[x][y] = 1;
        //down
        int nx = x + 1;
        int ny  =y;
        StringBuilder cp = path;
        //down
        if(isSafe(m, visited, nx, ny, n)){
            cp.append("D");
            solve(ans, m, visited,nx,ny, cp, n);
            cp.deleteCharAt(cp.length()-1);
        }
        //left
        nx = x;
        ny = y-1;
        if(isSafe(m, visited, nx, ny, n)){
            cp.append("L");
            solve(ans, m, visited,nx,ny, cp, n);
            cp.deleteCharAt(cp.length()-1);
        }
        //right
        nx = x;
        ny = y + 1;
        if(isSafe(m, visited, nx, ny, n)){
            cp.append("R");
            solve(ans, m, visited,nx,ny, cp, n);
            cp.deleteCharAt(cp.length()-1);
        }
        nx = x - 1;
        ny = y;
        if(isSafe(m, visited, nx, ny, n)){
            cp.append("U");
            solve(ans, m, visited,nx,ny, cp, n);
            cp.deleteCharAt(cp.length()-1);
        }
        visited[x][y] = 0;
    }
}
