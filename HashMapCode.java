import java.util.*;
public class HashMapCode{


     static class HashMap<k,v> {
        private class Node{
            k key;
            v value; 
            
            public Node(k key, v value){
                this.key= key;
                this.value=value;
            }
        }


        @SuppressWarnings("unchecked")
            private int n;
            private int N;
            private LinkedList<Node> bucket[];

            public HashMap(){
                this.N=4;
                this.bucket= new LinkedList[4];
                for(int i=0; i<4; i++){
                    this.bucket[i] = new LinkedList<>();

                }
            }

            private int searchindex(k key)
        {
            int bl =key.hashCode();
            return Math.abs(bl)%N;
        }

        private int searchvalue(k key, int bi)
        {
            LinkedList<Node> ll = bucket[bi];
            for(int i = 0; i<ll.size(); i++)
            {
                if(ll.get(i).key==key)
                {
                    return i;
                }
            }
            return -1;
        }
        private void rehash(){

            LinkedList<Node> buck[] = bucket;
            bucket= new LinkedList[N*2];
            for(int i=0; i<N*2; i++){
                bucket[i] = new LinkedList<>();
            }

            for(int i=0; i<buck.length; i++){
                LinkedList<Node>  ll= buck[i];
                for(int j=0; j<ll.size(); j++){
                    Node node=ll.get(j);
                    put(node.key, node.value);
                }
            }
        }
        public v remove(k key){
            int bi=searchindex(key);
            int di=searchvalue(key, bi);
            if(di==-1)
            {
                return null;
            }
            else{
            Node ptr = bucket[bi].remove(di);
            n--;
            return ptr.value;
            
            }
        }

        public v get(k key){
            int bi=searchindex(key);
            int di=searchvalue(key, bi);
            if(di==-1)
            {
                return null;
            }
            else{
            Node ptr = bucket[bi].get(di);
            return ptr.value;
            }
        }
        public boolean  contains(k key){
            int bi=searchindex(key);
            int di=searchvalue(key, bi);
            if(di==-1){
                return false;
            }
            else{
                return true;
            }
        }
        public ArrayList<k> keyset()
        {
            ArrayList<k> list = new ArrayList<>();
            for(int i=0; i<bucket.length; i++){
            LinkedList<Node> ll =bucket[i];
            for(int j=0; j<ll.size(); j++)
            {
                Node node = ll.get(j);
                list.add(node.key);
            }
        }
        return list;
    }



            public void put(k key, v value)
        {
            int bi=searchindex(key);
            int di=searchvalue(key,bi);
            if(di==-1)
            {
           bucket[bi].add(new Node(key,value));
           n++;
            }
            else{
            Node ptr=bucket[bi].get(di);
            ptr.value=value;
            }
            double lambda =(double)n/N;
            if(lambda>=2.0){
                rehash();
            }
        }
        
}
       

    
    
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("Antar", 206);
        hm.put("Antr", 20);
        hm.put("Anar", 26);
        System.out.println(hm.get("Anar"));
        System.out.println(hm.remove("Anar"));
        System.out.println(hm.contains("Antar"));
        ArrayList<String> set = hm.keyset();
        for(String key: set)
        {
            System.out.println(key+" "+hm.get(key));
        }
         }
        }