package tw.com.web;

public class MyObj {
	int x;
public boolean equals(Object obj) {
	MyObj o1 = (MyObj)obj;
	return x == o1.x;
}
}
