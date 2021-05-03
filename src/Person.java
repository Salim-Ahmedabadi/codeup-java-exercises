public class Person {
    public static void main(String[] args){
        Person salim = new Person();
        salim.name = "Salim";
        System.out.println(salim.getName());
        System.out.println(salim.setName("Sunny"));
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

        }
    }

