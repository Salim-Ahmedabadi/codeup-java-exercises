public class Person {
    public Person(String salim) {
        name = salim;
    }

    public static void main(String[] args){
        Person salim = new Person("salim");
        salim.name = "Salim";
        System.out.println(salim.getName());
        System.out.println(salim.setName("Sunny"));
        salim.sayHello();
    }

    private String name;
        public String getName(){

//TODO: return the person's name
        return name;
        }

        public String setName(String name){
//TODO: change the name property to the passed value
            this.name = name;
                return name;
        }
        public void sayHello(){
//TODO: print a message to the console using the person's name
            System.out.println("Hello " + this.name);

        }
    }

