package ch20.sec02;


import java.util.Date;
import lombok.Data;

@Data
public class Board {
	private int bno;
	private String btilte;
	private String bcontent;
	private String bwriter;
	private Date bdate;
}
