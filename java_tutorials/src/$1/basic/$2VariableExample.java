package $1.basic;

public class $2VariableExample {
    // Class variable
    static int classVar = 10;
    

    // Instance variable
    int instanceVar;

    // Constructor
    public $2VariableExample(int instanceVar) {
        this.instanceVar = instanceVar;
    }

    // Method
    public void display() {
        // Local variable
        int localVar = 20;
        System.out.println("Local Variable: " + localVar);
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Class Variable: " + classVar);
    }

    public static void main(String[] args) {
        $2VariableExample example = new $2VariableExample(30);
        example.display();
    }
}