// 에제 1-2 자바 8로 단어 빈도 수 세기

private List<String> regexToList(String words, string regex) {
    List wordList = new ArrayList<>();
    Matcher m = Pattern.compile(regex).matcher(words);
    while (m.find())
	wordList.add(m.group());
    return wordList;
}

public Map wordFreq(String words) {
    TreeMap<String, Integer> wordMap = new TreeMap<>();
    regexToList(words, "\\w+").stream()
	.map(w -> w.toLowerCase())
	.filter(w -> !NON_WORDS.contains(w))
	.forEach(w -> wordMap.put(w, wordMap.getOrDefault(w, 0) + 1));
    return wordMap;
}
