package com.uni.core.dto.studies;

/**
 * DeadLine for a student
 * @author igolovin
 *
 */
public class DeadLineDTO {
	
	private DeadLineInfoDTO deadLine;
	
	private DeadLineStateDTO deadLineState;
	
	private DeadLineScoreDTO deadLineScore;

	public DeadLineInfoDTO getDeadLine() {
		return deadLine;
	}

	public void setDeadLine(DeadLineInfoDTO deadLine) {
		this.deadLine = deadLine;
	}

	public DeadLineStateDTO getDeadLineState() {
		return deadLineState;
	}

	public void setDeadLineState(DeadLineStateDTO deadLineState) {
		this.deadLineState = deadLineState;
	}

	public DeadLineScoreDTO getDeadLineScore() {
		return deadLineScore;
	}

	public void setDeadLineScore(DeadLineScoreDTO deadLineScore) {
		this.deadLineScore = deadLineScore;
	}
	
}
