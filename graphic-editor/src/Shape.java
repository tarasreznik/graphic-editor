public abstract class Shape {

    public abstract String getName();
    protected String showClassName(){
        return this.getClass().getName();
    }
}
