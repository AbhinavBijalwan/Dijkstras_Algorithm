package com.Dijkstras.controller;
import com.Dijkstras.utilities.*;
import java.util.Scanner;
public class Test {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=5;
        int inf=999;
        int [][]graph=new int[n][n];
        int []sptSet=new int[5];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                graph[i][j]=sc.nextInt();
                if(graph[i][j]<=0)
                    graph[i][j]=inf;
            }
        }
        for(int i=0;i<n;i++){
            Dijkstras.dj(graph,n,i);
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(graph[i][j]+"   ");
            }
            System.out.println();
        }

    }
}
