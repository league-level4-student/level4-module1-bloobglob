package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	T[] arr;
	public ArrayList() {
		arr = (T[]) new Object[0];
	}
	public int size() {
		return arr.length;
	}
	public T get(int loc) throws IndexOutOfBoundsException {
		if(loc<arr.length) {
			return arr[loc];
		}else {
			throw new IndexOutOfBoundsException();
		}
	}
	
	public void add(T val) {
		T[] newArr = (T[]) new Object[arr.length+1];
		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		newArr[newArr.length-1] = val;
		arr = newArr;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] newArr = (T[]) new Object[arr.length+1];
		for (int i = 0; i < newArr.length; i++) {
			if(i<loc) {
				newArr[i] = arr[i];
			}else if(i==loc) {
				newArr[loc] = val;
			}else {
				newArr[i] = arr[i-1];
			}
		}
		arr = newArr;
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		arr[loc] = val;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		T[] newArr = (T[]) new Object[arr.length-1];
		for (int i = 0; i < arr.length; i++) {
			if(i<loc) {
				newArr[i] = arr[i];
			}else if(i>loc) {
				newArr[i-1] = arr[i];
			}
		}
		arr=newArr;
	}
	
	public boolean contains(T val) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(val)) {
				return true;
			}
		}
		return false;
	}
}