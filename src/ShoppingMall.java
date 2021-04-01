public class ShoppingMall {
    public static void main(String[] args) {
        FoodStore McDonald = new FoodStore("McDonald");
        Person store1 = McDonald;
        McDonald.setContact("Mike","0101122334");
        McDonald.setMenu(new Item<String,Double>("Burger",10.00),new Item<String,Double>("Fried Chicken",12));
        FoodStore McDonalds=new FoodStore(new Item[]{new Item("Burger","RM10"),new Item("Fried Chicken","RM12")},new Person("Mike", 0101122334), new String[]{"Jack", "Jane"});
        FoodStore Sushi_mentai=new FoodStore(new Item[]{new Item("Chicken Katsu Don","RM15"),new Item("Ramen","RM12")},new Person("Max",0112233445),new String[]{"Adam","Alex","Andrew"});
        FoodStore Waroeng_Penyet=new FoodStore(new Item[]{new Item("Ayam Penyet", "RM10")},new Person("Mike", 0101122334),new String[]{"Lex","Leon"});

        foodStores= new FoodStore[]{McDonalds, Sushi_mentai, Waroeng_Penyet};

        FoodStore[] fashionStores=new FoodStore[3];
        FoodStore Uniqlo=new FoodStore(new Item[]{new Item("Shirt","RM80"),new Item("T-shirt", "RM60")},new Person("Nate", null),new String[]{"Kate","Ken","Kurt"});
        FoodStore Padini=new FoodStore(new Item[]{new Item("Blouse","RM100"),new Item("Skirt", "RM80")},new Person("Nick", null),new String[]{"Frank","Felix"});
        FoodStore Mango=new FoodStore(new Item[]{new Item("Dress","RM120")},new Person("Nicole", null),new String[]{"Ron","John"});

        fashionStores=new FoodStore[]{Uniqlo,Padini,Mango};

    }
}
