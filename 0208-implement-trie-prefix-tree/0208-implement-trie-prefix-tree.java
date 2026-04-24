class Trie {

    class Node{
        Node[] c=new Node[26];
        boolean end;
    }

    Node root;

    public Trie(){
        root=new Node();
    }

    public void insert(String w){
        Node n=root;
        for(int i=0;i<w.length();i++){
            int idx=w.charAt(i)-'a';
            if(n.c[idx]==null)n.c[idx]=new Node();
            n=n.c[idx];
        }
        n.end=true;
    }

    public boolean search(String w){
        Node n=root;
        for(int i=0;i<w.length();i++){
            int idx=w.charAt(i)-'a';
            if(n.c[idx]==null)return false;
            n=n.c[idx];
        }
        return n.end;
    }

    public boolean startsWith(String p){
        Node n=root;
        for(int i=0;i<p.length();i++){
            int idx=p.charAt(i)-'a';
            if(n.c[idx]==null)return false;
            n=n.c[idx];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */