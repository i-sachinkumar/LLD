package design_patterns.observer_pattern.generic;

public class Main {
    public static void main(String[] args) {
        // Observable
        Observable<Integer> integerObservable = new Observable<>();

        //Observers
        Observer<Integer> observer1 = new Observer<>(integerObservable, data -> {
            System.out.println("observer 1 -> new data -> " + data);
        });
        Observer<Integer> observer2 = new Observer<>(integerObservable, data -> {
            System.out.println("observer 2 -> new data -> " + data);
        });

        integerObservable.registerObserver(observer1);
        integerObservable.registerObserver(observer2);


        integerObservable.setData(4);


        integerObservable.registerObserver(new Observer<>(integerObservable, new Observer.Callback<Integer>() {
            @Override
            public void onUpdate(Integer data) {
                System.out.println("observer 3 -> new data -> " + data);
            }
        }));

        integerObservable.setData(10);
    }
}
