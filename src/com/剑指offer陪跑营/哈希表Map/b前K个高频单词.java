package com.剑指offer陪跑营.哈希表Map;

import java.util.*;

public class b前K个高频单词 {
}


class Solutiona12 {
    public List<String> topKFrequent(String[] words, int k) {
        Hashtable<String, Integer> hashtable = new Hashtable<>();

        for (String word : words) {
            hashtable.put(word, hashtable.getOrDefault(word, 0) + 1);
        }

        //建立大顶堆
        PriorityQueue<Hashtable> maxheap = new PriorityQueue<>(Collections.reverseOrder());


        List<String> list = new ArrayList<>();
        return list;
    }
}

class Solutiona2 {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> cnt = new HashMap<String, Integer>();
        for (String word : words) {
            cnt.put(word, cnt.getOrDefault(word, 0) + 1);
        }


        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<Map.Entry<String, Integer>>(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2) {
                //entry1-entry2按照从小到大排序，entry2-entry1按照从大到小排序
                return entry1.getValue().equals(entry2.getValue()) ? entry2.getKey().compareTo(entry1.getKey()) : entry1.getValue() - entry2.getValue();
            }
        });

        for (Map.Entry<String, Integer> entry : cnt.entrySet()) {
            pq.offer(entry);
            //每次进k个，因为是小顶堆，value小的，key大的，都排在堆定了，大于k个了，就剔除堆顶的，重新从堆底部进入
            if (pq.size() > k) {
                pq.poll();
            }
        }

        List<String> ret = new ArrayList<>();

        while (!pq.isEmpty()) {
            ret.add(pq.poll().getKey());
        }
        Collections.reverse(ret);

        return ret;
    }
}


class Solutiona11 {

    public List<String> topKFrequent(String[] words, int k) {
        // 1.先用哈希表统计单词出现的频率
        Map<String, Integer> count = new HashMap();
        for (String word : words) {
            count.put(word, count.getOrDefault(word, 0) + 1);
        }
        // 2.构建小根堆 这里需要自己构建比较规则 此处为 lambda 写法 Java 的优先队列默认实现就是小根堆
        PriorityQueue<String> minHeap = new PriorityQueue<>((s1, s2) -> {
            if (count.get(s1).equals(count.get(s2))) {
                return s2.compareTo(s1);
            } else {
                return count.get(s1) - count.get(s2);
            }
        });
        // 3.依次向堆加入元素。
        for (String s : count.keySet()) {
            minHeap.offer(s);
            // 当堆中元素个数大于 k 个的时候，需要弹出堆顶最小的元素。
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        // 4.依次弹出堆中的 K 个元素，放入结果集合中。
        List<String> res = new ArrayList<String>(k);
        while (minHeap.size() > 0) {
            res.add(minHeap.poll());
        }
        // 5.注意最后需要反转元素的顺序。
        Collections.reverse(res);
        return res;
    }
}

//哈希表+小顶堆做法
class Solution11  {

    public List<String> topKFrequent(String[] words, int k) {
        //先统计单词的分类和数量
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        //自定义小顶堆比较方法
        PriorityQueue<Map.Entry<String, Integer>> heap = new PriorityQueue<>(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                //o1-o2按照从小到大排序，o2-o1按照从大到小排序
                return o1.getValue().equals(o2.getValue()) ? o2.getKey().compareTo(o1.getKey()) : o1.getValue() - o2.getValue();
            }
        });
        //将HashMap中的数据存入到heap中
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            heap.add(entry);
            //每次进k个，因为是小顶堆，value小的，key大的，都排在堆定了，大于k个了，就剔除堆顶的，重新从堆底部进入
            if (heap.size() > k) {
                heap.poll();
            }
        }
        //将堆中的数据.key取出来，放到列表中，因为是小顶堆，所以需要反转
        List<String> list = new ArrayList<>();
        while (!heap.isEmpty()) {
            list.add(heap.poll().getKey());
        }
        Collections.reverse(list);
        return list;
    }
}

//哈希表+大顶堆做法
class Solution12 {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        //自定义大顶堆和比较方法
        PriorityQueue<Map.Entry<String, Integer>> heap = new PriorityQueue<>(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().equals(o2.getValue()) ? o1.getKey().compareTo(o2.getKey()) : o2.getValue() - o1.getValue();
            }
        });
        //直接全部入堆
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            heap.add(entry);
        }
        //取堆中前k个，堆顶出来的前k个是最大的
        List<String> list = new ArrayList<>();
        while (!heap.isEmpty()) {
            list.add(heap.poll().getKey());
            if (list.size() == k) {
                break;
            }
        }
        return list;
    }
}


























