class PetShop {
    public static void main(String[] args){
        Cat puss = new Cat();
        puss.name = "Hudson";
        System.out.println(puss.name);

        Mouse jerry = new Mouse();
        jerry.name = "Jerry";
        System.out.println(jerry.name);
    }
}
class Mouse {
    public String name;
    public int tailLength;
}