package Java.Core.Day1;

public class test4 {
    
    // 1. No parameters, No return value
    public void noParamNoReturn() {
        System.out.println("No parameters, no return value");
    }
    
    // 2. No parameters, With return value
    public int noParamWithReturn() {
        return 42;
    }
    
    // 3. With parameters, No return value
    public void withParamNoReturn(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    
    // 4. With parameters, With return value
    public int withParamWithReturn(int a, int b) {
        return a + b;
    }
    
    // 5. Static method
    public static void staticMethod() {
        System.out.println("This is a static method");
    }
    
    // 6. Private method
    private void privateMethod() {
        System.out.println("This is a private method");
    }
    
    // 7. Protected method
    protected void protectedMethod() {
        System.out.println("This is a protected method");
    }
    
    // 8. Method with varargs
    public void varArgsMethod(String... items) {
        for (String item : items) {
            System.out.println(item);
        }
    }
    
    // 9. Method with multiple return types (overloading)
    public String getValue() {
        return "String value";
    }
    
    public double getValue(double num) {
        return num * 2;
    }
    
    // 10. Recursive method
    public int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
    
    // 11. Method throwing exception
    public void methodWithException() throws Exception {
        throw new Exception("Example exception");
    }
    
    // 12. Synchronized method (for threading)
    public synchronized void synchronizedMethod() {
        System.out.println("This is a synchronized method");
    }
    
    // 13. Final method (cannot be overridden)
    public final void finalMethod() {
        System.out.println("This is a final method");
    }
    
    // 14. Abstract-like method with default behavior
    public void defaultBehavior() {
        System.out.println("Default behavior");
    }
}
