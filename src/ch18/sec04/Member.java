package ch18.sec04;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
@NoArgsConstructor
public class Member implements Serializable{
	private static final long serialVersionUID = 3097528739363634112L;
	private String id;
	private String name;
}
