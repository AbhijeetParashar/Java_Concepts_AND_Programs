class Demo{
    public static void main(String[] args){
        System.out.println(10/2);
        System.out.println(10/5);
        try{
        System.out.println("SOP in try");
        System.out.println(10/0);
        System.out.println("Sop in try ends");
        }
        catch(Exception obj){
            System.out.println("CATCH block start");
            System.out.println("Error handles = " +obj);
            
        }
        System.out.println("CODE exception hadled");
        System.out.println(10/10);
    }
}