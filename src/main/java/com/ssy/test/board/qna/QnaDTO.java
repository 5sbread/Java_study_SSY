package com.ssy.test.board.qna;

import com.ssy.test.board.impl.BoardDTO;

public class QnaDTO extends BoardDTO{
	
	//QNA에서만 필요한 것 생성
	private Long ref;
	private Long step;
	private Long depth;
	
	
	public Long getRef() {
		return ref;
	}
	public void setRef(Long ref) {
		this.ref = ref;
	}
	public Long getStep() {
		return step;
	}
	public void setStep(Long step) {
		this.step = step;
	}
	public Long getDepth() {
		return depth;
	}
	public void setDepth(Long depth) {
		this.depth = depth;
	}
	

}
