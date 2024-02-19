package com.Fintoo.bdd.integrations.common_utils;

public class ResourceURIS {
	
    private static final String Get_Request_Json="/posts/{id}";
    private static final String Amit="/posts/{id}";

	        private static final String CureBay_Email_Login="/medicare/login/emailLogin/";
		    private static final String CureBay_Email_Login_Without_PayLoad="/medicare/login/emailLogin/";
		    private static final String CureBay_Email_LoginWo_Resource_URI="/";
		    private static final String CureBay_Email_LoginWo_medicare="/login/emailLogin/";
		    private static final String CureBay_Email_LoginWo_login="/medicare/emailLogin/";
		    private static final String CureBay_Email_LoginWo_emailLogin="/medicare/login/";
		    private static final String CureBay_Email_LoginOW_medicare="/medicare/";
		    private static final String CureBay_Email_LoginOW_login="/login/";
		    private static final String CureBay_Email_LoginOW_emailLogin="/emailLogin/";
		    private static final String CureBay_Email_LoginIV_Resource_URI="/Medi_Care/Login/Email_Login/";   
		    private static final String CureBay_Self_Login="/medicare/login/selfLogin/";
		    private static final String CureBay_Self_Login_Without_PayLoad="/medicare/login/selfLogin/";
		    private static final String CureBay_Self_LoginWo_Resource_URI="/";
		    private static final String CureBay_Self_LoginWo_medicare="/login/selfLogin/";
		    private static final String CureBay_Self_LoginWo_login="/medicare/selfLogin/";
		    private static final String CureBay_Self_LoginWo_selfLogin="/medicare/login/";
		    private static final String CureBay_Self_LoginOW_medicare="/medicare/";
		    private static final String CureBay_Self_LoginOW_login="/login/";
		    private static final String CureBay_Self_LoginOW_selfLogin="/selfLogin/";
		    private static final String CureBay_Self_LoginIV_Resource_URI="/medi-care/login/self-Login/";

		    private static final String Careplans="/medicare/careplans/compareAllPlans";
		    private static final String Careplans_invaliduri1="/medicare/careplans/compareAllPlans";
		    private static final String Careplans_invaliduri2="/careplans/compareAllPlans";
		    private static final String Careplans_invaliduri3="/medicare/compareAllPlans";
		    private static final String Careplans_invaliduri4="/medicare/careplans";
		    private static final String Careplans_invaliduri5="/medicare/compareAllPlans/careplans";
		    private static final String Healthcare="/api/healthcare-benfits";
		    private static final String Service="/api/health-package-our-service-details";
		    private static final String Service_noheaders="/api/health-package-our-service-details";
		    private static final String Service_noAuth="/api/health-package-our-service-details";
		    private static final String Service_invaliduri="/api/health-package";
		    private static final String Service_invaliduri1="/health-package";
		    private static final String Service_invaliduri2="/api";
		    private static final String Service_invaliduri3="/api//health-package";
		    private static final String Service_invaliduri4="/api.health-package";
		    private static final String Service_invaliduri5="/health-package/api";
	
		    private static final String CureBay_locationGetAll="/medicare/location/getAll";
		    private static final String CureBay_locationGetAll_Without_PayLoad="/medicare/location/getAll";
		    private static final String CureBay_locationGetAllWo_Resource_URI="/";
		    private static final String CureBay_locationGetAllWo_medicare="/location/getAll";
		    private static final String CureBay_locationGetAllWo_location="/medicare/getAll";
		    private static final String CureBay_locationGetAllWo_getAll="/medicare/location/";
		    private static final String CureBay_locationGetAllOW_medicare="/medicare/";
		    private static final String CureBay_locationGetAllOW_location="/location/";
		    private static final String CureBay_locationGetAllOW_getAll="/getAll";
		    private static final String CureBay_locationGetAllIV_Resource_URI="/medi-care/location/getall";

		    
		    private static final String CureBay_GetOurCarePlan="/medicare/careplans/getourcarePlan";
		    private static final String CureBay_GetOurCarePlan_Without_PayLoad="/medicare/careplans/getourcarePlan";
		    private static final String CureBay_GetOurCarePlanWo_Resource_URI="/";
		    private static final String CureBay_GetOurCarePlanWo_medicare="/careplans/getourcarePlan/";
		    private static final String CureBay_GetOurCarePlanWo_careplans="/medicare/getourcarePlan/";
		    private static final String CureBay_GetOurCarePlanWo_getourcarePlan="/medicare/careplans/";
		    private static final String CureBay_GetOurCarePlanOW_medicare="/medicare/";
		    private static final String CureBay_GetOurCarePlanOW_careplans="/careplans/";
		    private static final String CureBay_GetOurCarePlanOW_getourcarePlan="/getourcarePlan";
		    private static final String CureBay_GetOurCarePlanIV_Resource_URI="/medi_care/care_plans/getOur-carePlan";
		    
		    private static final String CureBay_HomePageNews="api/homepage-news";
		    private static final String CureBay_HomePageNewsIV_Resource_URI="api/homepagenews";
		    private static final String CureBay_DoctorsPages="api/doctors-pages";
		    private static final String CureBay_DoctorsPagesIV_Resource_URI="api/doctorspages";
		    private static final String CureBay_curebay_exps="api/curebay-exps";
		    private static final String CureBay_curebay_expsIV_Resource_URI="api/curebayexps";
		    
		    private static final String Relationship="medicare/careplans/relationship";
		    private static final String Relationship_invalid="medicare/careplans/";
		    private static final String Relationship_nouRI=" ";
		    private static final String schedule_getall = "medicare/schedule/getAll";
			private static final String schedule_getall_invalidURI = "medicare/schedule";
			private static final String schedule_getall_payloads = "medicare/schedule/getAll";
			private static final String schedule_getall_payloads_code = "medicare/schedule/getAll";
			private static final String schedule_getall_withoutURI = " ";
		
				private static final String Healthcare_noheader = "/api/healthcare-benfits";
				private static final String Healthcare_noToken = "/api/healthcare-benfits";
				private static final String Healthcare_invalitoken = "/api/healthcare-benfits";
				private static final String CB_HealthExercise = "api/home-page-medicares";
				private static final String CB_HealthExercise_invalidURI = "api/home-page";
			
			
			
			
			public static String getResourceURI(String requestName) {
				switch(requestName) {
				
				
				case "schedule_getall":
					return schedule_getall;
				case "schedule_getall_payloads":
					return schedule_getall_payloads;
				case "schedule_getall_payloads_code":
					return schedule_getall_payloads_code;
				case "CureBay_HomePageNews":
					return CureBay_HomePageNews;
				case "CureBay_HomePageNewsIV_Resource_URI":
					return CureBay_HomePageNewsIV_Resource_URI;
					
				case "CB_HealthExercise":
					return CB_HealthExercise;
				case "CB_HealthExercise_invalidURI":
					return CB_HealthExercise_invalidURI;
				case "schedule_getall_withoutURI":
					return schedule_getall_withoutURI;
					
					
				case "CureBay_DoctorsPages" : return CureBay_DoctorsPages;
				case "CureBay_DoctorsPagesIV_Resource_URI" : return CureBay_DoctorsPagesIV_Resource_URI;
				case "CureBay_curebay_exps" : return CureBay_curebay_exps;
				case "CureBay_curebay_expsIV_Resource_URI" : return CureBay_curebay_expsIV_Resource_URI;
				
				case "CureBay_GetOurCarePlan" : return CureBay_GetOurCarePlan;
				case "CureBay_GetOurCarePlan_Without_PayLoad" : return CureBay_GetOurCarePlan_Without_PayLoad;
				case "CureBay_GetOurCarePlanWo_Resource_URI" : return CureBay_GetOurCarePlanWo_Resource_URI;
				case "CureBay_GetOurCarePlanWo_medicare" : return CureBay_GetOurCarePlanWo_medicare;
				case "CureBay_GetOurCarePlanWo_careplans" : return CureBay_GetOurCarePlanWo_careplans;
				case "CureBay_GetOurCarePlanWo_getourcarePlan" : return CureBay_GetOurCarePlanWo_getourcarePlan;
				case "CureBay_GetOurCarePlanOW_medicare" : return CureBay_GetOurCarePlanOW_medicare;
				case "CureBay_GetOurCarePlanOW_careplans" : return CureBay_GetOurCarePlanOW_careplans;
				case "CureBay_GetOurCarePlanOW_getourcarePlan" : return CureBay_GetOurCarePlanOW_getourcarePlan;
				case "CureBay_GetOurCarePlanIV_Resource_URI" : return CureBay_GetOurCarePlanIV_Resource_URI;
				
				
				case "CureBay_locationGetAll" : return CureBay_locationGetAll;
				case "CureBay_locationGetAll_Without_PayLoad" : return CureBay_locationGetAll_Without_PayLoad;
				case "CureBay_locationGetAllWo_Resource_URI" : return CureBay_locationGetAllWo_Resource_URI;
				case "CureBay_locationGetAllWo_medicare" : return CureBay_locationGetAllWo_medicare;
				case "CureBay_locationGetAllWo_location" : return CureBay_locationGetAllWo_location;
				case "CureBay_locationGetAllWo_getAll" : return CureBay_locationGetAllWo_getAll;
				case "CureBay_locationGetAllOW_medicare" : return CureBay_locationGetAllOW_medicare;
				case "CureBay_locationGetAllOW_location" : return CureBay_locationGetAllOW_location;
				case "CureBay_locationGetAllOW_getAll" : return CureBay_locationGetAllOW_getAll;
				case "CureBay_locationGetAllIV_Resource_URI" : return CureBay_locationGetAllIV_Resource_URI;
				case "Relationship": return Relationship;
				case "Relationship_invalid": return Relationship_invalid;
				case "Relationship_nouRI": return Relationship_nouRI;
				
				case "CureBay_Self_Login" : return CureBay_Self_Login;
				case "CureBay_Self_Login_Without_PayLoad" : return CureBay_Self_Login_Without_PayLoad;
				case "CureBay_Self_LoginWo_Resource_URI" : return CureBay_Self_LoginWo_Resource_URI;
				case "CureBay_Self_LoginWo_medicare" : return CureBay_Self_LoginWo_medicare;
				case "CureBay_Self_LoginWo_login" : return CureBay_Self_LoginWo_login;
				case "CureBay_Self_LoginWo_selfLogin" : return CureBay_Self_LoginWo_selfLogin;
				case "CureBay_Self_LoginOW_medicare" : return CureBay_Self_LoginOW_medicare;
				case "CureBay_Self_LoginOW_login" : return CureBay_Self_LoginOW_login;
				case "CureBay_Self_LoginOW_selfLogin" : return CureBay_Self_LoginOW_selfLogin;
				case "CureBay_Self_LoginIV_Resource_URI" : return CureBay_Self_LoginIV_Resource_URI;
				
				
				case "CureBay_Email_Login" : return CureBay_Email_Login;
				case "CureBay_Email_Login_Without_PayLoad" : return CureBay_Email_Login_Without_PayLoad;
				case "CureBay_Email_LoginWo_Resource_URI" : return CureBay_Email_LoginWo_Resource_URI;
				case "CureBay_Email_LoginWo_medicare" : return CureBay_Email_LoginWo_medicare;
				case "CureBay_Email_LoginWo_login" : return CureBay_Email_LoginWo_login;
				case "CureBay_Email_LoginWo_emailLogin" : return CureBay_Email_LoginWo_emailLogin;
				case "CureBay_Email_LoginOW_medicare" : return CureBay_Email_LoginOW_medicare;
				case "CureBay_Email_LoginOW_login" : return CureBay_Email_LoginOW_login;
				case "CureBay_Email_LoginOW_emailLogin" : return CureBay_Email_LoginOW_emailLogin;
				case "CureBay_Email_LoginIV_Resource_URI" : return CureBay_Email_LoginIV_Resource_URI;
	
				case "Careplans":
					return Careplans;
				case "Careplans_invaliduri1":
					return Careplans_invaliduri1;
				case "Careplans_invaliduri2":
					return Careplans_invaliduri2;
				case "Careplans_invaliduri3":
					return Careplans_invaliduri3;
				case "Careplans_invaliduri4":
					return Careplans_invaliduri4;
				case "Careplans_invaliduri5":
					return Careplans_invaliduri5;
				case "Healthcare":
					return Healthcare;
				case "Service":
					return Service;
				case "Service_noheaders":
					return Service_noheaders;
				case "Service_noAuth":
					return Service_noAuth;
				case "Service_invaliduri":
					return Service_invaliduri;
				case "Service_invaliduri1":
					return Service_invaliduri1;
				case "Service_invaliduri2":
					return Service_invaliduri2;
				case "Service_invaliduri3":
					return Service_invaliduri3;
				case "Service_invaliduri4":
					return Service_invaliduri4;
				case "Service_invaliduri5":
					return Service_invaliduri5;
				case "Get_Request_Json":
					return Get_Request_Json;
				case "schedule_getall_invalidURI":
					return schedule_getall_invalidURI;
		        
				case "Healthcare_invalitoken": return Healthcare_invalitoken;
				case "Healthcare_noToken": return Healthcare_noToken;
				case "Healthcare_noheader": return Healthcare_noheader;
		        
		        
		        
		        
		        
		        
		        
		        
				default: throw new RuntimeException("Resource uri not defined for the specific file name - "+requestName);
				}
			}	
		}


