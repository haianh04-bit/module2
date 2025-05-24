public class MyQueue {
    public int capacity;
    public int[] queueArr;
    public int head = 0;
    public int tail = -1;
    public int currentSize = 0;
    public MyQueue(int queueSize) {
        this.capacity = queueSize;
        this.queueArr = new int[queueSize];
    }
    public boolean isQueueFull(){
        boolean status = false;
        if(currentSize == capacity){
            status = true;
        }
        return status;
    }
    public boolean isQueueEmpty(){
        boolean status = false;
        if(currentSize == 0){
            status = true;
        }
        return status;
    }
    public void enqueue(int item) {
        if(isQueueFull()){
            System.out.println("Đã đầy! Không thể thêm phần tử: " + item);
        }
        else{
            tail = (tail + 1) % capacity;
            queueArr[tail] = item;
            currentSize++;
            System.out.println("Đang sắp xếp " + item + " được đưa vào hàng đợi");
        }
    }
    public void dequeue() {
        if(isQueueEmpty()){
            System.out.println("Không thể xóa phần tử khỏi hàng đợi.");
        } else {
            head++;
            if(head == capacity) {
                System.out.println("Hoạt động pop đã hoàn tất! đã xóa: " + queueArr[head - 1]);
                head = 0;
            } else {
                System.out.println("Hoạt động pop đã hoàn tất! đã xóa: " + queueArr[head - 1]);
            }
            currentSize--;
        }
    }
}
