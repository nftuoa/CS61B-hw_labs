public class Dessert {
    int price;
    int flavor;
    public static int numDesserts;
    public void printDessert(){
        System.out.print(String.valueOf(flavor)+' '+String.valueOf(price)+' ' + String.valueOf(Dessert.numDesserts));
    }
    public Dessert(int f, int p)
    {
        price = p;
        flavor = f;
        Dessert.numDesserts++;
    }
    public static void main(String[] args)
    {
        System.out.println("I love dessert!");
    }
}
