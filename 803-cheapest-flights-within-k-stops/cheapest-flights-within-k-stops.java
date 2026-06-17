class Solution {
    class pair {
        int a;
        int b;
        pair(int a, int b){
            this.a = a;
            this.b = b;

        }
    }
    class triplet{
        int node;
        
        int dist;
        int stop;
        triplet(int stops,int node, int dist){
            this.node = node;
            this.dist = dist;
            this.stop = stops;
        }
    }
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        Queue<triplet> q = new ArrayDeque<>();
        List<List<pair>> l = new ArrayList<>();
        for(int i=0;i<n;i++) l.add(new ArrayList<>());
        for(int []a: flights){
            int s = a[0];
            int e = a[1];
            int d = a[2];
            l.get(s).add(new pair(e,d));
        }
        int dist[] = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src]= 0;
        q.add(new triplet(0,src,0 ));
        
        while(!q.isEmpty()){
            triplet x = q.poll();
            int u = x.node;
            int d = x.dist;
            int s = x.stop;
            if(s> k ) continue;
            for(pair nei: l.get(u)){
                int v = nei.a;
                int w = nei.b;
                if(d+w<dist[v] && s<=k){
                    dist[v]= d+w;
                    q.add(new triplet(s+1,v,dist[v]));
                }
            }

        }
        return dist[dst]<Integer.MAX_VALUE?dist[dst]: -1;

        
    }
}