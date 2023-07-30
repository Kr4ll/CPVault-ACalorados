def capitaliseWord(word: String): String = 
  word.replaceFirst(word.substring(0, 1), word.substring(0, 1).toUpperCase)
