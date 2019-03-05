import java.util.LinkedList;

class Order{
    int orderNumber;
    String content;
    int amount;

    Order(String content) {
        this.content = content;

        //search for amount by content in order menu
    }
}

class OrderingSystem {

    LinkedList<Order> incompleteOrderQueue = new LinkedList<>();
    LinkedList<Order> completeOrderQueue = new LinkedList<>();

    int currentOrderNumber = 0;
    long totalPaymentAccepted = 0;

    class Customer {

        int tokenNumber;

        int orderSomething(String content){

            Order order  = new Order(content);

            Cashier cashier = new Cashier();
            tokenNumber = cashier.takeOrder(order);

            return tokenNumber;
        }

        void waitForOrder() {}

        void acceptItem() {}

    }

    class Cashier {

        int takeOrder(Order order){
            totalPaymentAccepted += order.amount;

            return addOrderToQueue(order);
        }

        int addOrderToQueue(Order order){
            incompleteOrderQueue.add(order);
            return returnToken(order);
        }

        int returnToken(Order order){
            order.orderNumber = currentOrderNumber;
            return currentOrderNumber++;
        }

    }

    class Barista {

        void takeOrderFromQueue(){
            // when Barista gets free takes new order from Queue
            Order order = incompleteOrderQueue.pop();

            prepareOrder(order);
        }

        void prepareOrder(Order order){
            //prepare Order

            //after order is prepared place it in completeOrderQueue
            itemReady(order);

        }

        void itemReady(Order order){
            completeOrderQueue.push(order);

            notifyOrderReady(order);
        }

        void notifyOrderReady(Order order){
            // notify order ready
        }

    }
}