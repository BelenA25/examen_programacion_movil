package com.example.myapplication

class VocabularyRepository {
    fun getList():List<VocabularyModel>{
        return listOf(
            VocabularyModel(
                "a position", "A job or a title"),
            VocabularyModel(
                "a candidate", "Someone who is being considered for a job"),
            VocabularyModel(
                "human resources (HR)", "A job or a title"),
            VocabularyModel(
                "an application", "A formal, written request for a job, usually a form"),
            VocabularyModel(
                "a résumé", "A written description of your education, abilities, and jobs"),
            VocabularyModel(
                "a cover letter", "A letter you write that goes with your résumé, highlighting details about your work experience"),
            VocabularyModel(
                "a reference", "Someone who knows you well and can write a letter about you"),
            VocabularyModel(
                "a skill", "An ability to do something well")
        )
    }
}