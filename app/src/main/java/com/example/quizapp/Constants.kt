package com.example.quizapp

object Constants {
    const val USER_NAME:String="user_name"
    const val TOTAL_QUESTIONS:String="total_question"
    const val CORRECT_ANSWERS:String="correct_answers"

     fun getQuestions():ArrayList<Question>{
         val questionList=ArrayList<Question>()
         val ques1=Question(
             1,"What country does this flag belong to ?",
             R.drawable.ic_flag_of_india,
             "Argentina","India","America"
             ,"Armenia",
             2
         )
         questionList.add(ques1)
         val ques2=Question(
             2,"What country does this flag belong to ?",
             R.drawable.ic_flag_of_argentina,
             "Argentina","India","America"
             ,"Armenia",
             1
         )
         questionList.add(ques2)
         val ques3=Question(
             3,"What country does this flag belong to ?",
             R.drawable.ic_flag_of_germany,
             "Argentina","germany","Palestine"
             ,"Armenia",
             2
         )
         questionList.add(ques3)
          val ques4=Question(
             4,"What country does this flag belong to ?",
             R.drawable.ic_flag_of_kuwait,
             "sudan","India","Kuwait"
             ,"Armenia",
             3
         )
         questionList.add(ques4)
         val ques5=Question(
             5,"What country does this flag belong to ?",
             R.drawable.ic_flag_of_fiji,
             "Argentina","Fiji","Kuwait"
             ,"germany",
             2
         )
         questionList.add(ques5)
         val ques6=Question(
             6,"What country does this flag belong to ?",
             R.drawable.ic_flag_of_belgium,
             "Brazil","India","New Zealand"
             ,"Belgium",
             4
         )
         questionList.add(ques6)
         val ques7=Question(
             7,"What country does this flag belong to ?",
             R.drawable.ic_flag_of_denmark,
             "sudan","Denmark","Kuwait"
             ,"Armenia",
             2
         )
         questionList.add(ques7)
         val ques8=Question(
             8,"What country does this flag belong to ?",
             R.drawable.ic_flag_of_new_zealand,
             "New Zealand","Germany","Kuwait"
             ,"Armenia",
             1
         )
         questionList.add(ques8)
         val ques9=Question(
             9,"What country does this flag belong to ?",
             R.drawable.ic_flag_of_brazil,
             "Denmark","Fiji","Austrailia"
             ,"Brazil",
             4
         )
         questionList.add(ques9)
         return questionList
     }
}