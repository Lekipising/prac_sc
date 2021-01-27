def removeCh(word, ch):
    newWord = word.replace(ch, "")
    return newWord


def removeCh1():
    word = input("Enter  the word ")
    ch = input("Enter character to remove ")
    newWord = word.replace(ch, "")
    print(newWord)


print(removeCh("Hello", "o"))

removeCh1()

