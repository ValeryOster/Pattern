package interview.blinov;

import java.util.*;
import java.util.stream.Collectors;

public class OptionalTest {
    public static void main(String[] args) {
        List<Order> list = new ArrayList<>();
        list.add(new Order(71L, 100D));
        list.add(new Order(18L, 132D));
        list.add(new Order(24L, 210D));
        list.add(new Order(35L, 693D));
        OrderAction action = new OrderAction();
        Optional<Order> optionalOrder = action.findById(list, 24); // replaced by 23
        optionalOrder.ifPresent(x -> System.out.println(x));
        Set<Order> set = new HashSet<>();
        optionalOrder.ifPresent(set::add);// or o->set.add(o)
        System.out.println(set);
    }
}
class Order {
    private long l;
    private double v;

    public Order(long l, double v) {
        this.l = l;
        this.v = v;
    }

    public long getOrderId() {
        return l;
    }

    public void setL(long l) {
        this.l = l;
    }

    public double getV() {
        return v;
    }

    public void setV(double v) {
        this.v = v;
    }
}
class OrderAction {
    public Optional<Order> findById(List<Order> orders, long id) {
        Optional<Order> optionalOrder = orders.stream()
                .filter(o -> id == o.getOrderId())
                .findAny();
        return optionalOrder;
    }
}
