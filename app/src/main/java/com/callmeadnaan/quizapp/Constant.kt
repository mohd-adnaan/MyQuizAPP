package com.callmeadnaan.quizapp


object Constant {
    const val USER_NAME:String="user_name"
    const val TOTAL_QUESTIONS:String="total_question"
    const val CORRECT_ANSWERS:String="correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()
        val que1 = Question(

            1,"What country does this flag belong to?" ,
            R.drawable.ic_flag_of_argentina ,
        "Argentina", "Australia",
            "Armenia","Austria",
            1
        )
        questionsList.add(que1)
        val que2 = Question(

            2,"What country does this flag belong to?" ,
            R.drawable.ic_falg_of_vietnam ,
            "Vietnam", "Japan",
            "China","South Korea",
            1
        )
        questionsList.add(que2)

        val que3 = Question(

            3,"What country does this flag belong to?" ,
            R.drawable.ic_flag_of_india ,
            "India", "SriLanka",
            "Bangladesh","Pakistan",
            1
        )
        questionsList.add(que3)
        val que4 = Question(

            4,"What country does this flag belong to?" ,
            R.drawable.ic_flag_of_germany ,
            "Iceland", "Germany",
            "Georgia","Greece",
            2
        )
        questionsList.add(que4)
        val que5 = Question(

            5,"What country does this flag belong to?" ,
            R.drawable.ic_flag_of_france ,
            "Iceland", "Britain",
            "France","United Kingdom",
            3
        )
        questionsList.add(que5)
        val que6 = Question(

            6,"What country does this flag belong to?" ,
            R.drawable.ic_flag_of_canada ,
            "Mexico", "Australia",
            "Canada","Denmark",
            3
        )
        questionsList.add(que6)
        val que7 = Question(

            7,"What country does this flag belong to?" ,
            R.drawable.ic_flag_of_austra,
            "America", "Austria",
            "Poland","Australia",
            2
        )
        questionsList.add(que7)

        val que8 = Question(

            8,"What country does this flag belong to?" ,
            R.drawable.ic_flag_of_china ,
            "China", "North Korea",
            "South Korea","Fiji",
            1
        )
        questionsList.add(que8)


        val que9 = Question(

            9,"What country does this flag belong to?" ,
            R.drawable.ic_falg_of_japan ,
            "India", "South Korea",
            "Japan","Fiji",
            3
        )
        questionsList.add(que9)


        return questionsList
    }
}