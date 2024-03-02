public static int getAbsAdd (int x, int y) {
 if (x = Integer. MIN VALUE || y = Integer. MIN VALUE) {
  throw new IllegalArgumentException ();
 ｝
 int abs = Math. abs (x);
 int absY = Math. abs (y);
 if (absX > Integer MAX VALUE - absY) {
  throw new IllegalArgumentException ();
  }
 return absX + absY;
 }