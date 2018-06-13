package com.Dijkstras.utilities;
import java.util.Scanner;

public class Dijkstras {
    static Scanner scan;
    public static void dj(int[][] graph,int n,int src) {
        int inf=999;
        //int src;
       // int nextNode=0;
        //int n=5;
        int dist[]=new int[n];
        int v=0;
        int[] visited = new int[5];
       // int []preD = new int[5];
        //int [][]graph = new int[n][n];
        //int []visited = new int[5];

        for(int i=0;i<n;i++){
            visited[i]=0;
        }
        //src=scan.nextInt();//Source node
        dist=graph[src];
        visited[src]=1;
        dist[src]=0;
        for(int i =0; i<n ; i++) {
            inf=999;
            for(int j=0;j<n;j++){
                if(inf>dist[j] && visited[j]!=1){
                    inf=dist[j];
                    v=j;
                }
            }
            visited[v]=1;
            for(int j=0;j<n;j++){
                //if(visited[i]!=1)
                if((inf+graph[j][v]<dist[j]) && visited[j]!=1) {
                    dist[j] = inf + graph[j][v];
                   // sptSet[j] = v;
                }
            }
        }
        for(int i=0;i<n;i++) {
            //visited[i] = 0;
            graph[src][i]=dist[i];
        }

      /*  int j;
        for(int i=0;i<n;i++){
            if (i != 0) {
                System.out.println("Path = "+i);
                j=i;
                do {
                    j = sptSet[j];
                    System.out.println("<-" + j);
                }while(j!=0);
            }
        } */

    }
}



//Belmonford works on negative values
/*Input
        0 3 0 1 0
        3 0 2 0 0
        0 2 0 2 4
        1 2 0 0 3
        0 0 4 3 0
        0
*/