package az.coders.ada_students.lessons.lesson_13.exercise;

import java.util.Scanner;

public class User {
    public static void main(String[] args) {

        String username;
        String usersurname;
        String userfathername;
        int userage;
        String userspecialty;
        int userinternship;
        String userlanguage;
        String useraddress;

        String[] names = {"Chief Programming Specialist", "SEO Specialist", "General English And IELTS Instructor",
                "Lawyer", "Back-End Developer", "Marketing Manager", "SMM Manager", "Accountant",
                "Head of the Department of Seed and Plant Production",
                "Bakers, confectioners and confectioners, masters of yeast"};

        String[] descriptions = {
                "Education Higher education (Preference will be given to those with knowledge in Computer " +
                        "Science, Computer Engineering, Information Technology, Systems and Networks, Applied " +
                        "Mathematics, Physics, Electronics, Telecommunications or other engineering specialties) " +
                        "Ability High level logical-analytical thinking ability and mathematical knowledge Assignment " +
                        "Assignment Ability to be and free research Ability to build algorithms Ability to work " +
                        "responsibly and in a team Language skills Technical English (preferred) Technical Russian " +
                        "(preferred) Fluent in Azerbaijani Programming and Database knowledge High knowledge of Java - " +
                        "Programming language Experience in Python, C #, C ++, Java programming languages " +
                        "will be preferred. HTML, CSS, JavaScript. Jquery - general or theoretical knowledge on. " +
                        "Ability to work with SOAP, REST web services and write services Ability to work with " +
                        "Oracle Database (Querying, Table, Function, Creating Procedures, etc.) Operating systems " +
                        "Ability to work on Linux and Windows operating systems.",

                "Defining the SEO strategy of the portal, developing the semantic core," +
                        " SEO optimization of the site (with the support of programmers), monitoring the position of the site " +
                        "on Google using SEO tools, preparation of SEO texts.",

                "With education degrees and IELTS " +
                        "certification; Relevant teaching experience as an IELTS teacher; IELTS certificate (7.0) and at " +
                        "least one year of experience as an IELTS teacher; Flexibility and an adaptable teaching style; " +
                        "Creative skills and ideas for planning practical and interesting lessons; Excellent spoken and " +
                        "written communication skills; Ability to work collaboratively as a member of a team.",

                "To be a member of the Bar Association of the Republic of Azerbaijan; At " +
                        "least 3 years of experience as a lawyer; Language skills: Azerbaijani (Russian is desirable); " +
                        "Ability to work with individuals and legal entities; Ability to work with government agencies; " +
                        "Ability to work with social networks; Ability to communicate and work in a team; Advanced computer " +
                        "skills in standard MS Office programs (Word, Excel, etc.)",

                "Requirements: Proficient with Java, REST APIs, Microservice " +
                        "architecture, Spring Boot, Spring Data, Spring Security; Advanced skill with SQL and other common " +
                        "database connections; Deep understanding of Linux; Experience with Git; Analytical and " +
                        "problem-solving skills with keen attention to detail; Ability to work closely with other " +
                        "team members",

                "Must be a graduate of the Faculty of Economics; Preference is given to those studying in Turkey " +
                        "or Europe; Must have at least 5 years of experience in marketing management positions; " +
                        "Experienced in local / international sales and marketing, must be on customer and regional " +
                        "visits; Must be fluent enough to hold talks and meetings and report in English, Russian and " +
                        "Turkish; Must be well versed in marketing techniques and applications; Must have analytical " +
                        "thinking, strong time management and planning skills; Must be able to form a marketing " +
                        "team and manage a team; Customer satisfaction should be preferred",

                "At the professional level, Fb Ads Manager, Fb Business Manager, " +
                        "Fb Pixel, etc. management and settings; Knowledge of SEO, Google Analytics, Google Ads is an " +
                        "advantage; Be responsible, punctual, enthusiastic and efficient in their work; At least 1 year " +
                        "of work experience in an advertising agency; Ability to work in Facebook business suite; Ability " +
                        "to use Facebook and Instagram Ads ads; Ability to prepare a monthly EMC plan; Responsible, able " +
                        "to work in a team and honest; Must have creative thinking skills; Knowledge of SEO, CRM is an " +
                        "advantage",

                "Development of operations in 1C program; Banking and cash operations; Ability to use e-taxes.gov.az, " +
                        "e-gov.az and other portals; as well as other banking operations; Preparation of e-invoices, " +
                        "delivery acts and invoices; identify and ensure the submission of statistical, management " +
                        "and financial reports (balance sheet, financial results, cash flows and changes in equity); " +
                        "Computer: Must know Microsoft Office Programs (Word, Excell), Outlook Express!",

                "To implement agro-technical and technological rules for each plant in the field it serves and to " +
                        "ensure the production of trees, shrubs and flowers in accordance with quality standards " +
                        "and customer orders with low labor costs; - To develop programs on fertilization, spraying, " +
                        "irrigation regimes of individual trees, shrubs and flowers; - To determine the feeding " +
                        "rations according to the development phase of the plant (fertilization, mineral supply, " +
                        "etc.); - To follow the rules of cultivation (feeding) and feeding in accordance with the " +
                        "vegetative development of the plant; - To determine the biological maturity of the plant, " +
                        "to take measures for chemical and mechanical control of diseases and pests; - Proper " +
                        "organization of certain labor, fulfillment of work norms for efficient use of labor force " +
                        "and equipment; - Be aware of seed varieties, determine seed variety and sowing time " +
                        "according to soil and air temperature; -Provide reports on the work done. Similarly, " +
                        "Higher Education in Agriculture; - Knowledge and experience in the field of production " +
                        "technology of trees, shrubs and flowers; - Age: 30-50; - At least 5 years of experience " +
                        "in the agricultural sector (cultivation of trees, shrubs and flowers); - Ability to " +
                        "think analytically and logically in terms of problem solving; - Experience working in " +
                        "greenhouses and outdoors; - Responsible, disciplined and resilient to stress, teamwork; " +
                        "- Knowledge and experience in the field of herbicides, fungicides, insecticides and other " +
                        "chemicals, their active ingredients and use; - Theoretical and practical knowledge of the " +
                        "plant in the field of disease and pest control measures; - Management skills; - Operational, " +
                        "enthusiastic approach to work; - Must know how to use MS Office and Internet, E-Mail.",

                "OVEN Bakery and Confectionery Production Plant requires experienced bakers, " +
                        "confectioners. Responsibility on the basis of salary agreement, efficiency Documentation " +
                        "in accordance with the Labor Code of the Republic of Azerbaijan;"};

        String[] salaries = {"2000-2500 AZN", "400-500 AZN", "800-1000 AZN", "2000-2500 AZN", "1000-1500 AZN",
                "1500-3000 AZN", "500-800 AZN", "500-700 AZN", "900 AZN", "600-700 AZN"};

        String[] mails = {"hr@millikart.az", "info@tender.az", "office@maxgroup.info.az", "office@mgc.az",
                "tofigk@crbn.az", "hr@deluxekamin.com", "azcars@azcars.az", "info@mjfinance.az",
                "aysel.ramazanova@ekol.az", "hr@oven.az"};


        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------- > Job Application < ----------------");
        System.out.println();

        System.out.print("Please enter your name: ");
        username = scanner.nextLine();

        System.out.print("Please enter your surname: ");
        usersurname = scanner.nextLine();

        System.out.print("Please enter your father name: ");
        userfathername = scanner.nextLine();

        System.out.print("Please enter your age: ");
        userage = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Please enter your specialty: ");
        userspecialty = scanner.nextLine();

        System.out.print("Please enter your internship (year): ");
        userinternship = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Please enter one of your better-language-skill: ");
        userlanguage = scanner.nextLine();

        System.out.print("Please enter your address or residential address: ");
        useraddress = scanner.nextLine();

        Data data = new Data();

        data.setName(username);
        data.setSurname(usersurname);
        data.setFathername(userfathername);
        data.setAge(userage);
        data.setSpecialty(userspecialty);
        data.setInternship(userinternship);
        data.setLanguage(userlanguage);
        data.setAddress(useraddress);

        Checker checker = new Checker(data.specialty);

        //
        checker.setJobName(names);
        checker.setDescription(descriptions);
        checker.setSalary(salaries);
        checker.setEmail(mails);




        System.out.println("---------------- > Applicant < ----------------");
        System.out.println(data);
        System.out.println("-----------------------------------------------");

        System.out.println();

        System.out.println("---------------- > Vacancies < ----------------");
        System.out.println(checker);
        System.out.println("-----------------------------------------------");

    }
}
