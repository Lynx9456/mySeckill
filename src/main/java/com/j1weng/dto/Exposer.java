package com.j1weng.dto;

public class Exposer {
	//是否开启秒杀
	private boolean exposed;
	private String md5;
	//id为seckilliId的商品的秒杀地址
	private long seckillId;
	private long now;
	private long start;
	private long end;
	
	// 秒杀商品存在，当前秒杀时间在秒杀时间范围之内，开启秒杀，暴露秒杀接口
	public Exposer(boolean exposed, String md5,long seckillId) {
		this.exposed = exposed;
		this.md5 = md5;
		this.seckillId = seckillId;
	}
	//秒杀商品存在，但当前时间不在秒杀时间范围之内，不开启秒杀，不暴露秒杀接口，只显示时间
	public Exposer(boolean exposed, long seckillId,long now,Long start,long end) {
        this.exposed = exposed;
        this.seckillId=seckillId;
        this.now = now;
        this.start = start;
        this.end = end;
	}
	//商品不存在，不开启秒杀
	public Exposer(boolean exposed,long seckillId) {
		this.exposed = exposed;
		this.seckillId = seckillId;
	}
	 public boolean isExposed() {
	        return exposed;
	    }

	    public void setExposed(boolean exposed) {
	        this.exposed = exposed;
	    }

	    public String getMd5() {
	        return md5;
	    }

	    public void setMd5(String md5) {
	        this.md5 = md5;
	    }

	    public long getSeckillId() {
	        return seckillId;
	    }

	    public void setSeckillId(long seckillId) {
	        this.seckillId = seckillId;
	    }

	    public long getNow() {
	        return now;
	    }

	    public void setNow(long now) {
	        this.now = now;
	    }

	    public long getStart() {
	        return start;
	    }

	    public void setStart(long start) {
	        this.start = start;
	    }

	    public long getEnd() {
	        return end;
	    }

	    public void setEnd(long end) {
	        this.end = end;
	    }
	    @Override
	    public String toString() {
	        return "Exposer{" +
	                "exposed=" + exposed +
	                ", md5='" + md5 + '\'' +
	                ", seckillId=" + seckillId +
	                ", now=" + now +
	                ", start=" + start +
	                ", end=" + end +
	                '}';
	    }
}

