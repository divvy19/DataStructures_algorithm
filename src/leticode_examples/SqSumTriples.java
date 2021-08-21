package leticode_examples;

public class SqSumTriples {

int countTriples(int n ){
    int answer =0;
    for(int a=1 ; a <= n ;a++){
        for(int b=1 ;b <= n;b++){
            for(int c=1 ;c <= n;c++){
                if(a*a + b*b == c*c){
                    ++answer;
                }
            }
        }
    }

return answer;

}

    public static void main(String args[]){
        SqSumTriples sq = new SqSumTriples();
        int n=5;
        
        System.out.print(sq.countTriples(n));
    }
    
}
