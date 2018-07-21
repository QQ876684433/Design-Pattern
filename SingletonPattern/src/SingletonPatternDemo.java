public class SingletonPatternDemo {
    public static void main(String[] args) {
        SingleObject object = SingleObject.getInstance();
        object.showMessage();
        SingleObject obj = SingleObject.getInstance();
        System.out.println(obj == object);
    }
}
