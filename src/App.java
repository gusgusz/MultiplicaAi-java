public class App {
    public static void main(String[] args) throws Exception {
        int ref = 1;
        while(ref<=10){
        String title = "Tabuada do número: "+ref + "!";
        System.out.println(title);
        for(int i = 0; i <=10;i++){
            int mul = ref*i;
            String res = ref+"x"+i+" = "+mul;
            System.out.println(res);
        }
        ref++;
    }
    
}
}
