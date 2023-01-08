package metanit;

 class  Person {

    String name;
    public String getName(){ return name; }

    public Person() {
        super();
        System.out.println("Default cons");
    }

    public Person(String name){
        this();

        this.name=name;
    }

    protected void display(){
       //this.getName();
        System.out.println("Name: " + name);
    }
}
