package minesweeper.score;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UserScore implements Serializable, Comparable<UserScore> {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private long id;
	private String name;

	private int time;
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public UserScore() {
		
	}
	
/*	private final String name;
	private final int time;
*/
	public UserScore(String name, int time) {
		this.name = name;

		this.time = time;
	}

	public String getName() {
		return name;
	}
	
	public int getTime() {
		return time;
	}

	@Override
	public int compareTo(UserScore o) {		
		return time - o.time;
//		if(time < o.time)
//			return -1;
//		else if(time > o.time)
//			return 1;
//		return 0;
	}

	public void setTime(int i) {
		// TODO Auto-generated method stub
		
	}
}
