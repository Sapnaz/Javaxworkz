class BuyRunner
{
public static void main(String[] args)
{
System.out.println("BuyRunner is running");
Buy.product("top",650 );
Buy.product("top",-650 );
Buy.product("dress",2,"Good",5000);
Buy.product("dress",0,"Good",5000);
Buy.bookMovieTicket("Krish","Vijayalakshmi",1,100);
Buy.bookMovieTicket("Dev","Annapoorna",0,100);
Buy.buyEgg(100,10);
Buy.buyEgg(8,10);
Buy.buyShampoo(20,2,"Dove","21/8/23");
Buy.buyShampoo(15,15,"Dove","3/5/22");
Buy.buyCake('m',"pastry","ButterScotch",300,3);
Buy.buyCake('s',"pastry","Strawberry",4000,2);
Buy.buyLaptop("Lenovo",1231,55000,100,17,"intel",450,8);
Buy.buyLaptop("Lenovo",1231,40000,100,17,"intel",450,2);
Buy.buySmartWatch("apple",10000,3,'C',1);
Buy.buySmartWatch("apple",10000,1,'B',2);
}
}