package factory.method;

/**
 * @author yitiansong
 * 2024/5/7
 */
public abstract class Pizza {
    public void prepare(){
        System.out.println("prepare");
    }
    public void bake() {
        System.out.println("bake");
    }
    public void cut() {
        System.out.println("cut");
    }

    public void box() {
        System.out.println("box");
    }
}
