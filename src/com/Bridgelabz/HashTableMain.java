package com.Bridgelabz;

    public class HashTableMain {
        public static void main(String[] args) {
            MyHashTable<String, Integer> hashTable = new MyHashTable();
            String sentence = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
            String[] sentenceArray = sentence.toLowerCase().split(" ");

            for (String word : sentenceArray) {
                Integer count = hashTable.get(word);

                if (count == null)
                    count = 1;
                else
                    count = count + 1;
                hashTable.add(word, count);
            }
            System.out.println(hashTable);
        }
    }