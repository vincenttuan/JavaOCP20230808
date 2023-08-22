package day18;

import java.util.Objects;

public class Exam implements Comparable<Exam> {
	private String name;
	private Integer score;
	
	public Exam(String name, Integer score) {
		this.name = name;
		this.score = score;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, score);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Exam other = (Exam) obj;
		return Objects.equals(name, other.name) && Objects.equals(score, other.score);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Exam [name=" + name + ", score=" + score + "]";
	}

	@Override
	public int compareTo(Exam o) {
		return score - o.getScore();
		//return o.getScore() - score;
	}
	
	
	
}
