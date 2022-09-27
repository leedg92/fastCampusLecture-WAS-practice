package FastCampusLecture.WAS.practice;

public class QueryString {
    private final String key;
    private final String value;

    public QueryString(String key, String value) {
        this.key = key;
        this.value = value;

    }

    public String getValue() {
        return this.value;
    }

    public String getKey() {
        return this.key;
    }

    public boolean exists(String key) {
        return this.key.equals(key);
    }
}
