package com.package1;
public class Cat {
    private String name;
    private int age; // in years
    private String breed;

    public Cat(String name, int age, String breed) {

        this.name = name;
        this.age = age;
        this.breed = breed;

    }

    // Note how we don't need .this here!
    public String getName() {
        return name;
    }


    public void eat(String food) {

        if (food.equals("fish") || food.equals("treats")) {
            System.out.println(name + " ate the " + food);
        } else {
            System.out.println("Eww! " + name + " doesn't like " + food + ", and ignored you");
        }

    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public void sleep() {
        System.out.println(name + " took a short catnap");
    }

    public Integer getCatAge() {
        return 7*age;
    }

    //my way
    public Integer getNewAge(){
        int newAge = 0;

        if(age==0){
            newAge = getCatAge();

        }  else if (age==1) {
            float newFirstAge = 25/2.0f;
            newAge += newFirstAge;

        } else if (age==2) {
            newAge = 25;

        }else{
            newAge =25+4*(7*(age-2));
        }
        return newAge;
    }

    //prof way
    public Integer getNewAge1(){
       if(age==0){
            return 0;

        }  else if (age==1) {
            return 12;

        } else if (age==2) {
            return 25;

        }else{
            return 25 + ((age-2)*4);
        }

    }

    public static void main(String[] args) {

        Cat cat = new Cat("Kitty", 3, "Scottish fold");
        System.out.println("My cat is called " + cat.getName());

        cat.eat("chocolates");
        cat.eat("fish");
        cat.sleep();

        System.out.println("Kitty is " + cat.getCatAge() + " years in cat year calender");
        System.out.println("The new age is " + cat.getNewAge()+" years in my way");
        System.out.println("The new age is " + cat.getNewAge1()+" years in prof way");

    }

}