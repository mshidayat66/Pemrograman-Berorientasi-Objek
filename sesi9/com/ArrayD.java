
package sesi9.com;

import java.util.ArrayDeque;

public class ArrayD {
    public static void main(String[] args) {
        ArrayDeque<Integer> nilai = new ArrayDeque<>();
        nilai.add(84);
        nilai.addFirst(80);
        nilai.addLast(90);
        boolean x = nilai.offer(95); //Akan mengembalikan nilai true jika berhasil dimasukkan
        nilai.add(89);
        System.out.println("Element yang dipop : " + " " + nilai.pop()); //Menghapus Nilai Yang Ada di Head
        System.out.println(x);
        for(Integer n : nilai){
            System.out.println(n);
        }
    }
}
