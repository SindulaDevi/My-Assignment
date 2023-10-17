function reverseWordsInSentence(sentence) {
    const words = sentence.split(" ");
    const reversedWords = words.map(word => {
      // Reverse each word
      return word.split("").reverse().join("");
    });
    return reversedWords.join(" ");
  }
  
  const inputSentence = "This is a Sunny Day";
  const reversedSentence = reverseWordsInSentence(inputSentence);
  console.log(reversedSentence);