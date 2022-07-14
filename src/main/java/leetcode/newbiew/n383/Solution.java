package leetcode.newbiew.n383;

class Solution {
  public boolean canConstruct(String ransomNote, String magazine) {
    if (ransomNote.length() > magazine.length()) {
      return false;
    }

    int[] charCounts = charCounts(magazine);
    return canConstruct(ransomNote, charCounts);
  }

  private int[] charCounts(String magazine) {
    int[] charCounts = new int[26];
    char[] chars = magazine.toCharArray();
    for (char aChar : chars) {
      charCounts[aChar - 'a']++;
    }
    return charCounts;
  }

  private boolean canConstruct(String ransomNote, int[] charCounts) {
    char[] chars = ransomNote.toCharArray();
    for (char aChar : chars) {
      if (--charCounts[aChar - 'a'] < 0) {
        return false;
      }
    }

    return true;
  }
}
