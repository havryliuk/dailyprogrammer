from collections import Counter

file = open('63256-0.txt', encoding='utf8')
raw_text = file.read()
words = raw_text.split(sep=' ')
words = [word for word in words if word not in '—']

# remove odd characters in words
char_mapping = {
    ord(i): None for i in '\n .,!:*"?\\\'-'
}
for i, word in enumerate(words):
    words[i] = word.translate(char_mapping)

stop_words = set(open('stop_words.txt').read().split())
for word in stop_words:
    word.lower()

filtered_words = []
for word in words:
    if word.lower() not in stop_words:
        filtered_words.append(word)

counter = Counter(filtered_words)
print(counter.most_common(50))
