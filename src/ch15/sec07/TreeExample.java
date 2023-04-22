package ch15.sec07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class TreeExample {
	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<>();
		treeSet.add(new Person("홀길동",45)); //객체 어떤게 더 큰 객체인가?-이름or나이로 정렬할 수 있음
		treeSet.add(new Person("홀길서",25)); // comparable or comparator 
		treeSet.add(new Person("홀길남",31)); //소스 코드를 수정 할 수 잇는 상황이면 comparalbe을 사용
		for(Person p : treeSet) {			
			System.out.println(p);
		}
		
		//캣은 수정 못하는 상황이라면?
		TreeSet<Cat> catSet = new TreeSet<>(new CatComparator()); 
		catSet.add(new Cat("나비",3));
		catSet.add(new Cat("하쿠",1));
		catSet.add(new Cat("보곱",2));
		for(Cat c : catSet) {
			System.out.println(c);
		}
		
		ArrayList<Cat> arrayList = new ArrayList<>();
		arrayList.add(new Cat("나비",3));
		arrayList.add(new Cat("하쿠",1));
		arrayList.add(new Cat("보곱",2));
		Collections.sort(arrayList, new CatComparator());
		for(Cat c : arrayList) {
			System.out.println(c);
		}
		// ArrayList로 배열하는 방법
		// Collections는 인터페이스 
		// sort를 사용하려면 comparable하거나(Person처럼)comparator를 넣어주어야한다
	}
}

class CatComparator implements Comparator<Cat>{
	@Override
	public int compare(Cat o1, Cat o2) { //꼭 Cat 붙여줘야함 아니면 오브젝트가 자동으로 되어서 형변환 해주어야함
		return o1.getAge() - o2.getAge();
	}
}

@AllArgsConstructor
@ToString
@Setter
@Getter
class Person implements Comparable<Person>{
	private String name;
	private int age;
	@Override
	public int compareTo(Person o) {
		return this.age - o.age ; //this.age 와 o와 비교
		// return -(this.age - o.age) ; //내림차순 비교 		
		//크면양수 작으면 음수가 리턴됨.
	}
}

@AllArgsConstructor
@ToString
@Setter
@Getter
class Cat{
	private String name;
	private int age;
}//Cat은 수정 못하는 상황이라면?