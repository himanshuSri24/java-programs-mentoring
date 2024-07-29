/*
 * Problem Scenario:
 * Callable
 * Camera
 * Smartphone
 */

interface Callable {
    // in interfaces, only abstract classes.
    int num = 10;

    void call();

    void receiveCall();

    void disconnect();
}

interface Camera {
    int num = 20;

    void clickPicture();

    void recordVideo();
}

class Smartphone implements Callable, Camera {
    // int num = 30;

    Smartphone() {
        System.out.println("Smartphone's constructor");
        System.out.println("Callable Num: " + Callable.num);
        System.out.println("Camera Num: " + Camera.num);
    }

    @Override
    public void call() {
        System.out.println("Calling");
    }

    @Override
    public void receiveCall() {
        System.out.println("Receiving call");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting");
    }

    @Override
    public void clickPicture() {
        System.out.println("Clicking picture");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording video");
    }

    void display() {
        System.out.println("Displaying");
        System.out.println("num in Callable: ");
        System.out.println("num in Camera: ");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Smartphone obj = new Smartphone();
        obj.call();
        obj.receiveCall();
        obj.disconnect();
        obj.clickPicture();
        obj.recordVideo();
    }
}
