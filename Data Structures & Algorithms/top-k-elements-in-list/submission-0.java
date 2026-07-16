class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums) {
            map.merge(i , 1, (v1, v2) -> v1+v2);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(
            Comparator.comparingInt(Map.Entry<Integer, Integer>::getValue)
        );

        for(Map.Entry<Integer, Integer> etr : map.entrySet()) {
            minHeap.offer(etr);

            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        int[] answer = new int[k];

        for (int i = k - 1; i >= 0; i--) {
            answer[i] = minHeap.poll().getKey();
        }

        return answer;

    }
}
