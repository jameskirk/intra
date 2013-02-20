package com.uni.jpa.studies;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.uni.jpa.base.Student;

/**
 * DeadLine for a student
 * @author igolovin
 *
 */
@Entity
public class Deadline {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@ManyToOne
	private DeadlineInfo deadLine;
	@Enumerated
	private DeadlineState deadLineState;
	@Enumerated
	private DeadlineScore deadLineScore;
	@ManyToOne
	private Student student;

	public DeadlineInfo getDeadLine() {
		return deadLine;
	}

	public void setDeadLine(DeadlineInfo deadLine) {
		this.deadLine = deadLine;
	}

	public DeadlineState getDeadLineState() {
		return deadLineState;
	}

	public void setDeadLineState(DeadlineState deadLineState) {
		this.deadLineState = deadLineState;
	}

	public DeadlineScore getDeadLineScore() {
		return deadLineScore;
	}

	public void setDeadLineScore(DeadlineScore deadLineScore) {
		this.deadLineScore = deadLineScore;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
