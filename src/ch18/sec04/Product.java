package ch18.sec04;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Product implements Serializable {
	private static final long serialVersionUID = -7657136197398935316L;
	private String name;
	private int price;
}
