class WordDictionary {
    class Node{
        Node[] c=new Node[26];
        boolean end;
    }

    Node root;

    public WordDictionary(){
        root=new Node();
    }

    public void addWord(String w){
        Node n=root;
        for(int i=0;i<w.length();i++){
            int idx=w.charAt(i)-'a';
            if(n.c[idx]==null)n.c[idx]=new Node();
            n=n.c[idx];
        }
        n.end=true;
    }

    public boolean search(String w){
        return dfs(w,0,root);
    }

    private boolean dfs(String w,int i,Node n){
        if(n==null)return false;
        if(i==w.length())return n.end;

        char ch=w.charAt(i);

        if(ch=='.'){
            for(int k=0;k<26;k++){
                if(n.c[k]!=null && dfs(w,i+1,n.c[k]))return true;
            }
            return false;
        }else
            return dfs(w,i+1,n.c[ch-'a']);
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */