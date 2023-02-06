import java.util.LinkedList;
import java.util.Queue;


public class ServiceStation<T extends Transport> {
    private Queue<T> queue = new LinkedList<>();

    public Queue<T> getTheQueueForInspection() {
        return queue;
    }
    public void addQueue(T transport) {
        if (transport instanceof Bus){
            System.out.println("Автобусы не проходят ТО ");
        }else {
            queue.add(transport);
            System.out.println("Транспорт " + transport + " необходимо пройдти ТО ");
        }
    }

    public void spendTO() {
        T transport = queue.poll();
        if (transport != null) {
            System.out.println(transport + " Проходит ТО ");
        }else {
            System.out.println(" Нет транспорта в очереди ");
        }

    }





    @Override
    public String toString() {
        return "Поставьте транспорт на тех обслуживание " ;
    }
}