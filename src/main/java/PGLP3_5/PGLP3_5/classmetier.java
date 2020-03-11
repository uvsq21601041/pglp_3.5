package PGLP3_5.PGLP3_5;

import java.time.LocalDateTime;

interface IReader{
    public String getContent();
}
public class classmetier {
	public void narrate(IReader reader){
		LocalDateTime nowTime= LocalDateTime.now();
		System.out.println(nowTime+reader.getContent());
		}
}
