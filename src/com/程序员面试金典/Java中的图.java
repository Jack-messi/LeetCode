package com.程序员面试金典;

public class Java中的图 {

}

//邻接矩阵的存储方式：
class MGraph {
    private int[][] edges;//邻接矩阵
    private int numOfEdges;//边的数目
    private int numOfVetex;//顶点的数目

    //初始化一个邻接矩阵
    public MGraph(int n) {
        edges = new int[n][n];
        numOfEdges = 0;
        numOfVetex = n;
    }


}

class LGraph {
    //顶点表节点
    private class VNode{
        int data;              //起点的序号
        ArcNode firstArc;      //指向第一条边




        public VNode(int data, ArcNode firstArc) {
            this.data = data;
            this.firstArc = firstArc;
        }

        public int getData() {
            return data;
        }
        public void setData(int data) {
            this.data = data;
        }
        public ArcNode getFirstArc() {
            return firstArc;
        }
        public void setFirstArc(ArcNode firstArc) {
            this.firstArc = firstArc;
        }
    }

    //边表结点
    private class ArcNode{
        int adjvex;           //该边指向终点的序号
        ArcNode nextarc;      //下一条边的指针
        int len;              //该边的长度

        public ArcNode(int adjvex, ArcNode nextarc, int len) {
            super();
            this.adjvex = adjvex;
            this.nextarc = nextarc;
            this.len = len;
        }

        public int getAdjvex() {
            return adjvex;
        }

        public void setAdjvex(int adjvex) {
            this.adjvex = adjvex;
        }

        public ArcNode getNextarc() {
            return nextarc;
        }

        public void setNextarc(ArcNode nextarc) {
            this.nextarc = nextarc;
        }

        public int getLen() {
            return len;
        }

        public void setLen(int len) {
            this.len = len;
        }
    }



}
