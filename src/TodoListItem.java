
public class TodoListItem {
	String description;
	int priority;
	boolean done;

	public TodoListItem(String description, int priority) {
		// TODO Auto-generated constructor stub
		this.description = description;
		this.priority = priority;
		this.done = false;
	}

	public String getDescription() {
		// TODO Auto-generated method stub
		return  this.description;
		
	}

	public int getPriority() {
		// TODO Auto-generated method stub
		return this.priority;
	}

	public boolean isDone() {
		// TODO Auto-generated method stub
		return this.done;
	}

	public void markDone() {
		// TODO Auto-generated method stub
		this.done = true;
		
	}

}
