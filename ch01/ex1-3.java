// 예제 1-3 아파치 커먼즈의 StringUtils의 indexOfAny()

// From Apache Commons Lang, http://commons.apache.org/lang/
public static int indexOfAny(String str, char[] searchChars) {
    if (isEmpty(str) || ArrayUtils.isEmpty(searchChars)) {
	return INDEX_NOT_FOUND;
    }

    int csLen = str.length();
    int csLast = -1;
    int searchLen = searchChars.length;
    int searchLast = searchLen - 1;
    for (int i = 0; i < csLen; i++) {
	char ch = str.charAt(i);
	for (int j = 0; j < searchLen; j++) {
	    if (searchChars[j] == ch) {
		if (i < csLast && j < searchLast && CharUtils.isHighSurrogate(ch)) {
		    if (searchChars[j + 1] == str.charAt(i + 1)) {
			return i;
		    }
		} else {
		    return i;
		}
	    }
	}
    }
    return INDEX_NOT_FOUND;
}
