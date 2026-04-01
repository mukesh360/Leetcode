class StockSpanner {
    List<Integer> arr;

    public StockSpanner() {
        arr = new ArrayList<>();
    }
    
    public int next(int price) {
        arr.add(price);
        int span = 1;

        for (int i = arr.size() - 2; i >= 0; i--) {
            if (arr.get(i) <= price) {
                span++;
            } else {
                break;
            }
        }

        return span;
    }
} 