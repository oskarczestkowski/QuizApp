package com.example.quizo;

public class QuestionAnswer {

    public static String question[] ={
        "Which company owns the android?",
        "Which one is not the programming language?",
        "What does the Internet prefix WWW stand for?",
        "When was Microsoft founded?",
        "What is the name for a computer pointing device?",
        "Which of these is not an example of malware?"
    };

    public static String choices[][] = {
            {"Google","Apple","Nokia","Samsung"},
            {"Java","Kotlin","Notepad","Python"},
            {"Wide Width Wickets","Worldwide Weather",
                    "Western Washington World","World Wide Web"},
            {"1970","1986","1991","1975"},
            {"a modem","a sound card","a monitor","a mouse"},
            {"trojan","computer worm","plug-in","spyware"}
    };

    public static String correctAnswers[] = {
        "Google",
        "Notepad",
        "World Wide Web",
        "1975",
        "a mouse",
        "plug-in"
    };

}
