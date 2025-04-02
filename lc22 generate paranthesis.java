class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        generate("(",1,0,list,n);
        return list;
        
    }
    private void generate(String s,int op,int cl,List<String> list,int n){
        if(s.length()==2*n){
            list.add(s);
            return;

        }
        if(op<n){
            generate(s+"(",op+1,cl,list,n);
        }
        if(cl<op){
            generate(s+")",op,cl+1,list,n);
        }
    }
}
