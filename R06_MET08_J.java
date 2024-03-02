public final class CaseInsensitiveString {
  private String s;
 
  public CaseInsensitiveString(String s) {
    if (s == null) {
      throw new NullPointerException();
    }
    this.s = s;
  }
 
  public boolean equals(Object o) {
    return o instanceof CaseInsensitiveString &&
        ((CaseInsensitiveString)o).s.equalsIgnoreCase(s);
  }
 
  public int hashCode() {/* ... */}
 
  public static void main(String[] args) {
    CaseInsensitiveString cis = new CaseInsensitiveString("Java");
    String s = "java";
    System.out.println(cis.equals(s)); // Returns false now
    System.out.println(s.equals(cis)); // Returns false now
  }
}