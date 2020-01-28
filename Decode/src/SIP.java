
public class SIP {
	private String from;

	private String to;

	private String via;

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getVia() {
		return via;
	}

	public void setVia(String via) {
		this.via = via;
	}

	@Override
	public String toString() {
		return "ClassPojo [from = " + from + ", to = " + to + ", via = " + via + "]";
	}
}
