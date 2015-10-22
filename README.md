# hospital-management
Database hms_db
Table structure for table admitpatient_room
Column	Type	Null	Default
AdmitID	int(11)	No	
PatientID	varchar(50)	No	
Disease	text	No	
RoomNo	varchar(50)	No	
AdmitDate	text	No	
DoctorID	varchar(50)	No	
AP_Remarks	text	No	
Table structure for table admitpatient_ward
Column	Type	Null	Default
AdmitID	int(11)	No	
PatientID	varchar(50)	No	
Disease	text	No	
Wardname	varchar(50)	No	
AdmitDate	text	No	
DoctorID	varchar(50)	No	
AP_Remarks	text	No	
Table structure for table bill_room
Column	Type	Null	Default
BillNo	int(11)	No	
DischargeID	int(11)	No	
BillingDate	text	No	
NoOfDays	int(11)	No	
RoomCharges	double	No	
TotalRoomCharges	double	No	
ServiceCharges	double	No	
TotalCharges	double	No	
PaymentMode	text	No	
PaymentModeDetails	text	No	
ChargesPaid	double	No	
DueCharges	double	No	
				
Table structure for table bill_ward
Column	Type	Null	Default
BillNo	int(11)	No	
DischargeID	int(11)	No	
BillingDate	text	No	
BedCharges	double	No	
NoOfDays	int(11)	No	
TotalBedCharges	double	No	
ServiceCharges	double	No	
TotalCharges	double	No	
PaymentMode	text	No	
PaymentModeDetails	text	No	
ChargesPaid	double	No	
DueCharges	double	No	
Table structure for table dischargepatient_room
Column	Type	Null	Default
ID	int(11)	No	
AdmitID	int(11)	No	
DischargeDate	text	No	
DP_Remarks	text	No	
Table structure for table dischargepatient_ward
Column	Type	Null	Default
ID	int(11)	No	
AdmitID	int(11)	No	
DischargeDate	text	No	
DP_Remarks	text	No	
Table structure for table doctor
Column	Type	Null	Default
DoctorID	varchar(50)	No	
DoctorName	text	No	
Fathername	text	No	
Address	text	No	
ContactNo	text	No	
Email	text	No	
Qualifications	text	No	
Specialization	text	No	
Gender	text	No	
BloodGroup	text	No	
DateOfJoining	text	No	
Table structure for table patientregistration
Column	Type	Null	Default
PatientID	varchar(50)	No	
Patientname	text	No	
Fathername	text	No	
Address	text	No	
ContactNo	text	No	
Email	text	No	
Age	int(11)	No	
Gen	text	No	
BG	text	No	
Remarks	text	No	
Table structure for table registration
Column	Type	Null	Default
username	text	No	
Password	text	No	
NameOfUser	text	No	
ContactNo	text	No	
Email	text	No	
Table structure for table room
Column	Type	Null	Default
RoomNo	varchar(50)	No	
RoomType	text	No	
RoomCharges	int(11)	No	
RoomStatus	text	No	
Table structure for table services
Column	Type	Null	Default
ServiceID	int(11)	No	
Servicename	text	No	
ServiceDate	text	No	
PatientID	varchar(50)	No	
ServiceCharges	int(11)	No	
Table structure for table users
Column	Type	Null	Default
Username	text	No	
user_Password	text	No	
Table structure for table ward
Column	Type	Null	Default
wardname	varchar(50)	No	
wardtype	text	No	
NoOfBeds	int(11)	No	
Charges	int(11)	No	
Table structure for table wardboy_nurse_tbl
Column	Type	Null	Default
ID	varchar(50)	No	
W_N_Name	text	No	
Category	text	No	
Address	text	No	
ContactNo	text	No	
Email	text	No	
Qualifications	text	No	
BloodGroup	text	No	
DateOfJoining	text	No	

