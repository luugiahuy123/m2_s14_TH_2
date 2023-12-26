class Main {
    public static void main(String[] args) {
        // Khởi tạo một mảng số nguyên
        int[] list = {5, 3, 8, 2, 1};

        // Gọi phương thức bubbleSort để sắp xếp mảng
        bubbleSort(list);

        // In ra mảng đã sắp xếp
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }

    public static void bubbleSort(int[] list) {
        int n = list.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list[j] > list[j + 1]) {
                    // Hoán đổi các phần tử nếu thứ tự không đúng
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
    }
}