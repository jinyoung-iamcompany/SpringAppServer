package hello;

public class Gretting {
	private final long id;
	private final String content;
	
	public Gretting(long id, String content){
		this.id = id;
		this. content = content;
	}
	
	public long getID(){
		return id;
	}
	
	public String getContent(){
		return content;
	}
}