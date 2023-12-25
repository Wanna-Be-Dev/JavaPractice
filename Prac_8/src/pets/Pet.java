package pets;

public  class Pet {

    public String name;
    public int age;
    public String getName(){ return name; }
    public int getAge(){ return age; }
    public Pet(String name,int age){

        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Pet [name=" + name + ",age=" + age + "]";
    }
}