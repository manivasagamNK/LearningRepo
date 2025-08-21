package com.projects.springproject.javaproject;


import java.util.*;

public class SubarraySum {
    public static void main(String[] args) {
        String prefixInput[] = {"flight", "flow", "flower"};
//        String prefix =testCommonPrefix(prefixInput);
//        System.out.println("common prefix "+prefix);

//        testCommonPrefixTreeBased(prefixInput);

//        int arr[] = {2, 1, 5, 3, 2};
//        testMaxSumSubArray(arr);

//        int arr[] = {12, -1, -7, 8, 15, 30, 16, 28};
//        findNegInsubArr(arr);

//        String text = "cbaebabacd";
//        String pattern = "abc";
//        findAnagram(text, pattern);

        int arr[] = {1, 3, -1, -3, 5, 3, 6, 7};
        findMaxSubArray(arr);

    }

    private static void findMaxSubArray(int[] arr) {
        List<Integer> result = new ArrayList<>();
        Deque<Integer> deque = new ArrayDeque<>();
        int k = 3;
        int maxNum = 0;
        for (int i = 0; i < arr.length; i++) {

            if (!deque.isEmpty() && deque.peekFirst() < i - k) {
                deque.pollFirst();
            }
            while (!deque.isEmpty() && arr[deque.peekLast()] < arr[i]) {
                deque.pollLast();
            }
            deque.offerLast(i);
            if (i >= k - 1) {
                result.add(arr[deque.peekFirst()]);
            }
        }
        System.out.println(result);
    }

    private static void findAnagram(String text, String pattern) {
        int count[] = new int[26];
        int window[] = new int[26];
        int len = 0;
        int k = pattern.length();

        for (Character ch : pattern.toCharArray()) {
            count[ch - 'a']++;
        }

        for (int i = 0; i < text.length(); i++) {
            window[text.charAt(i) - 'a']++;

            if (i >= k) {
                window[text.charAt(i - k) - 'a']--;
            }
            if (Arrays.equals(count, window)) {
                len++;
            }
        }
        System.out.println(len);
    }

    private static void findNegInsubArr(int[] arr) {
        int k = 3;
        List<Integer> result = new ArrayList<>();
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < arr.length; i++) {
            if (!deque.isEmpty() && deque.peek() < i - k + 1) {
                deque.poll();
            }
            if (arr[i] < 0) {
                deque.offer(i);
            }
            result.add(deque.isEmpty() ? 0 : arr[deque.peek()]);
        }
        System.out.println(result);
    }

    private static void testMaxSumSubArray(int[] arr) {
        int k = 3;
        int maxSum = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (i >= k - 1) {
                maxSum = Math.max(maxSum, sum);
                sum = sum - arr[i - k + 1];
            }
        }
        System.out.println(maxSum);
    }

    private static void testCommonPrefixTreeBased(String[] input) {
        Trie node = new Trie();
        for (String word : input) {
            node.insert(word);
        }

    }

    private static String testCommonPrefix(String[] input) {


        String prefix = input[0];
        for (int i = 1; i < input.length; i++) {

            while (!input[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty())
                    return "";
            }
        }
        return prefix;
    }
}
