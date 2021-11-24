package com.example.quizapp

object setData {

    const val name:String="name"
    const val score:String="score"

    fun getQuestion():ArrayList<QuestionData>{
        var que:ArrayList<QuestionData>?= arrayListOf()

        var question1 =QuestionData(
            1,
            "Who is the Father of our Nation?",
            "Mahatma Gandhi",
            "Sardar Patel",
             "Javaharlal Nehru",
            "Abdul Kalam",
            1
        )
        var question2 =QuestionData(
            2,
            "who was the first Indian Woman in space ?",
            "Kalpana chawala",
            "Sunita Williams",
            "Koneruy Humpy",
            "None Of Above",
            1
        )
        var question3 =QuestionData(
            3,
            "Who was the first President of India?",
            "Baba Saheb aambedkar",
            "Kiran Bedi",
            "Lal Bhadur Sastri",
            "Dr. Rajendra Prasad",
            4,

        )
        var question4 =QuestionData(
            4,
            "what is the capital of India?",
            "UP",
            "MP",
            "Delhi",
            "lucknow",
            3
        )
        var question5 =QuestionData(
            5,
            "What city is the statue of liberty in?",
            "caneda",
            "New York City",
            "Dubai",
            "lucknow",
            2
        )
        var question6 =QuestionData(
            6,
            "Giddha is the folk dance of?",
            "Gova",
            "Hariyana",
            "Delhi",
            "Punjab",
            4
        )
        var question7 =QuestionData(
            7,
            "Which is the heavier metal of these?",
            "Gold",
            "Silver",
            "Platinum",
            "Copper",
            1
        )
        var question8 =QuestionData(
            8,
            "What is the Name of biggest flower?",
            "Jasmin",
            "Lotus",
            "Rafflesia",
            "Rose",
            3
        )
        var question9 =QuestionData(
            9,
            "Who is known as the father of modern computers?",
            "Isaac Newton",
            "Silver",
            "Marie Curie",
            "Charles Babbage",
            4
        )
        var question10 =QuestionData(
            10,
            "Which is the biggest planet in our Solar System?",
            "Venus",
            "Jupiter",
            "Mercury",
            "Mars",
            2
        )
          que?.add(question1)
          que?.add(question2)
          que?.add(question3)
          que?.add(question4)
          que?.add(question5)
          que?.add(question6)
          que?.add(question7)
          que?.add(question8)
          que?.add(question9)
          que?.add(question10)

          return que!!
    }
}