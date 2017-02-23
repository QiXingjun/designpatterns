package com.qixingjun.builder;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/23
 * @Description
 */
public class QxjCarDirector implements CarDirector {

    private CarBuilder carBuilder;

    public QxjCarDirector(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    @Override
    public Car directCar() {
        Engine engine = carBuilder.buildEngine();
        Seat seat = carBuilder.buildSeat();
        Tyre tyre = carBuilder.buildTyre();

        //组装成汽车对象
        Car car = new Car();
        car.setEngine(engine);
        car.setSeat(seat);
        car.setTyre(tyre);
        return car;
    }
}
