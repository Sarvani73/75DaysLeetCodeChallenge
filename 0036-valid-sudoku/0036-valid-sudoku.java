class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[] r=new int[9],c=new int[9],b=new int[9];

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char ch=board[i][j];
                if(ch=='.')continue;

                int v=1<<(ch-'1');
                int idx=(i/3)*3+(j/3);

                if((r[i]&v)!=0||(c[j]&v)!=0||(b[idx]&v)!=0)
                    return false;

                r[i]|=v;
                c[j]|=v;
                b[idx]|=v;
            }
        }
        return true;
    }
}