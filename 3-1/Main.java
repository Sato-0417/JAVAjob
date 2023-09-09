public class Main {
    public static void main(String[] args) {
        // 問1
        // int型の配列dataを作成し、値を3,1,2,7,5で初期化しなさい
        int[] data = {3, 1, 2, 7, 5};

        // 問2
        // 以下のfor文を完成させなさい
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();

        // バブルソートの実装
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - 1 - i; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }

        // 問3
        // ソートが完成したので、配列を出力
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }
}
