package sorting;

import java.util.Scanner;


class HeapArray{
	int[] heap;
	int cnt;
	int parentIdx;
	
	public HeapArray(int N) {
		heap = new int[N];
		this.cnt = 0;
	}
	
	private void addArrange() {
		if(this.cnt == 0) return;
		int idx = cnt;
		
		parentIdx = (idx - 1) / 2;

		int parentVal;
		int curVal;
		
		while(true) {
			if(idx == 0) break;
			parentVal = heap[parentIdx];
			curVal = heap[idx];
			
			if(parentVal < curVal) {
				heap[idx] = parentVal;
				heap[parentIdx] = curVal;
				
				idx = parentIdx;
				parentIdx = (idx - 1) / 2;
			}else break;
		}
	}
	
	public void add(int value) {
		
		this.heap[cnt] = value;
		this.addArrange();
		cnt++;
	}
	
	public int delete() {
		int rootVal = delArrange();
		return rootVal;
		
	}
	private int delArrange() {
		if(this.cnt == 0) return -1;
		
		int rootVal = heap[0];
		
		this.heap[0] = this.heap[cnt-1];
		this.cnt--;
		
		int curIdx = 0;
		int largerIdx, curVal, largerVal;
		
		while(true) {
			if(curIdx * 2 + 2 >= cnt) {
				if(curIdx * 2 + 1 >= cnt) break;
				else largerIdx = curIdx * 2 + 1;
			}else if(heap[curIdx * 2 + 1] > heap[curIdx * 2 + 2]) {
				largerIdx = curIdx * 2 + 1;
			}else largerIdx = curIdx * 2 + 2;
			
			curVal = heap[curIdx];
			largerVal = heap[largerIdx];
			
			if(curVal > largerVal) break;
			else {
				heap[curIdx] = largerVal;
				heap[largerIdx] = curVal;
				
				curIdx = largerIdx;
			}
		}
		return rootVal;
	}
}

public class HeapSortArray {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();		
		HeapArray myheap = new HeapArray(N);
		
		String ans = "";
		
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
