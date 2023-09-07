package etc.api904.collection906.list906;

public class User {
    private String name;
    private int age;

   
    public User(String name, int age) {	
        this.name = name;
        this.age = age;
    }

    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

  
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
   public String toString() {
	   return "이름=" + name + ", 나이=" + age + "세";
   }

   
}

	
