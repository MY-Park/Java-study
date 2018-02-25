package sorting;

import java.util.Scanner;
import java.util.Vector;


class Heap{
	Vector<Integer> heap = new Vector<Integer>();
	int cnt;
	int parentIdx;
	
	public Heap() {
		this.cnt = 0;
	}
	
	private void addArrange() {
		if(this.cnt == 0) return;
		int idx = cnt;
		
		parentIdx = (idx - 1) / 2;
		int temp;
		
		while(true) {
			if(idx == 0) break;
			if(heap.get(parentIdx) < heap.get(idx)) {
				temp = heap.get(idx);
				heap.set(idx,heap.get(parentIdx));
				heap.set(parentIdx,temp);
				
				idx = parentIdx;
				parentIdx = (idx - 1) / 2;
			}else break;
		}
	}
	
	public void add(int value) {
		
		this.heap.add(value);
		this.addArrange();
		cnt++;
	}
	
	public int delete() {
		int rootVal = delArrange();
		return rootVal;
		
	}
	private int delArrange() {
		if(this.cnt == 0) return -1;
		
		int rootVal = this.heap.get(0);
		
		this.heap.set(0,this.heap.get(cnt-1));
		this.heap.remove(cnt-1);
		this.cnt--;
		
		int curIdx = 0;
		int largerIdx;
		int temp;
		
		while(true) {
			if(curIdx * 2 + 2 >= cnt) {
				if(curIdx * 2 + 1 >= cnt) break;
				else largerIdx = curIdx * 2 + 1;
			}else if(heap.get(curIdx * 2 + 1) > heap.get(curIdx * 2 + 2)) {
				largerIdx = curIdx * 2 + 1;
			}else largerIdx = curIdx * 2 + 2;
			
			if(heap.get(curIdx) > heap.get(largerIdx)) break;
			else {
				temp = heap.get(curIdx);
				heap.set(curIdx, heap.get(largerIdx));
				heap.set(largerIdx, temp);
				
				curIdx = largerIdx;
			}
		}
		return rootVal;
	}
}

public class HeapSortVector {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Heap myheap = new Heap();
		
		String ans = "";
		
		int N = sc.nextInt();
		int value;
		
		for(int i=0; i<N; i++) {
			value = sc.nextInt();
			myheap.add(-value);
		}
		sc.close();
		
		for(int i=0; i<N; i++) {
			ans += -myheap.delete() + "\n";
		}
		System.out.print(ans);
	}
}
