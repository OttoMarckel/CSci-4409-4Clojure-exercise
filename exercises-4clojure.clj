;;; Put your solutions to the assigned 4Clojure exercises here and commit
;;; back up to your fork on Github.

;;; What you enter is what whatever you'd put in the "Code which fills in the blank"
;;; box in 4Clojure. You're welcome to include other things here (helper definitions,
;;; scratch computations you found helpful, etc.), SO MAKE SURE YOU LABEL YOUR
;;; "ANSWERS" clearly.

;;; I've included a few examples below just to give you a sense of what I'm looking
;;; for.

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; Problem #162: Logical falsity and true

; What I pasted in the box:

1

; because all the given expressions returned 1, for example:

(= 1 (if [] 1 0))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; Problem #15: Double Down

; What I pasted in the box:

#(* 2 %)

; which is an anonymous function that doubles its argument, for example:

(= (#(* 2 %) 11) 22)

;;; Problem #10: Intro to the maps

; What I pasted in the box:

20

;because we returned the part that was after :b

;;; Problem 16: Hello World

;What I pasted

format "Hello, %s!"

;This takes what is after and makes one string

;;; Problem 17: Sequences: Map

;What I pasted

'(6 7 8)

;Add 5 to each one

;;;Problem 18: Sequences: Filter

;What I pasted

'(6 7)

;Return only those that are greater then 5

;;;Problem 20: Penultimate element

;What I pasted

#(nth (reverse %) 1)

;This counts backwards and takes the one that is 1 less then the last

;;; Problem 21: Nth element

;What I pasted

(fn nthing [a b] (first (nthnext a b)))

;takes a nd b to find nth element

;;;Problem 23: Reverse a Sequence

;What I pasted

into '()

;;;Problem 25: FInd the odd numbers

;What I pasted

filter odd?

;This returns all odd numbers in the sequence

;;;Problem 37: REgular Expressions

;What I pasted:

"ABC"

;This returns all of the uppercase letters as requested

;;;Problem 40: Interpose a Seq

;What I pasted:

(fn Interpose [a b] (drop-last (interleave b (repeat a))))

;This function takes a and b to interleave the two

;;;Problem 43: Reverse Interleave

;What I pasted

(fn Disassemble [a b] (apply map list(partition b a)))

;Takes a and b where a is the list and b is the size of the new list

;;;Problem 44: Rotate Sequence

;What I pasted

#(take (count %2) (drop (mod %1 (count %2)) (cycle %2)))

;This takes a number and uses it to rotate the sequence around that spot

;;;Problem 46: Flipping out

;What I pasted

(fn Flippers [a] (fn [c b] (a b c)))

;This takes a and applies it to b and c in teverse order

;;;Problem 47: Contain Yourself

;What I pasted in the box

4

;The key

