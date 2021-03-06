import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

@JsonPropertyOrder({ "Method", "Request-URI", "Via", "From", "To", "Call-ID", "CSeq", "Proxy-Authorization",
	"Content-Type", "Content-Length", "Date", "Contact", "Expires", "Accept", "Max-Forwards", "User-Agent",
"Allow" })
public class SipData {
	@JsonProperty("Method")
	private String method;
	@JsonProperty("Request-URI")
	private String requestURI;
	@JsonProperty("Via")
	private String via;
	@JsonProperty("From")
	private String from;
	@JsonProperty("To")
	private String to;
	@JsonProperty("Call-ID")
	private String callID;
	@JsonProperty("CSeq")
	private String cSeq;
	@JsonProperty("Proxy-Authorization")
	private String proxyAuthorization;
	@JsonProperty("Content-Type")
	private String contentType;
	@JsonProperty("Content-Length")
	private String contentLength;
	@JsonProperty("Date")
	private String date;
	@JsonProperty("Contact")
	private String contact;
	@JsonProperty("Expires")
	private String expires;
	@JsonProperty("Accept")
	private String accept;
	@JsonProperty("Max-Forwards")
	private String maxForwards;
	@JsonProperty("User-Agent")
	private String userAgent;
	@JsonProperty("Allow")
	private String allow;

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getRequestURI() {
		return requestURI;
	}

	public void setRequestURI(String requestURI) {
		this.requestURI = requestURI;
	}

	public String getVia() {
		return via;
	}

	public void setVia(String via) {
		this.via = via;
	}

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

	public String getCallID() {
		return callID;
	}

	public void setCallID(String callID) {
		this.callID = callID;
	}

	public String getcSeq() {
		return cSeq;
	}

	public void setcSeq(String cSeq) {
		this.cSeq = cSeq;
	}

	public String getProxyAuthorization() {
		return proxyAuthorization;
	}

	public void setProxyAuthorization(String proxyAuthorization) {
		this.proxyAuthorization = proxyAuthorization;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getContentLength() {
		return contentLength;
	}

	public void setContentLength(String contentLength) {
		this.contentLength = contentLength;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getExpires() {
		return expires;
	}

	public void setExpires(String expires) {
		this.expires = expires;
	}

	public String getAccept() {
		return accept;
	}

	public void setAccept(String accept) {
		this.accept = accept;
	}

	public String getMaxForwards() {
		return maxForwards;
	}

	public void setMaxForwards(String maxForwards) {
		this.maxForwards = maxForwards;
	}

	public String getUserAgent() {
		return userAgent;
	}

	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

	public String getAllow() {
		return allow;
	}

	public void setAllow(String allow) {
		this.allow = allow;
	}

}