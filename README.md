Hospital_Management_Software
============================

The software provides handling of various patient records. It keeps track of number of beds in wards, patient ward information, billing, discharge with total amount due and update transfer patient details, patient personal information.


=================================================================================================

Classes

1)Patient
2)Registration
3)Ward
4)Transaction
5)Admit
6)Doctor
7)Report
8)Edit


Responsibilities 		Collaboration


1.Admit patient                             Ward
	                                          Admit
	                                          Doctor

2. Bed Allotment                            Patient
    				                                Ward

3. Prescribe test                           Report 
				                                    Patient
				                                    Doctor

4. Update Charges                           Edit 
                                            Transaction
                                            Patient

5.Transfer patient                          Edit
                                            Ward
                                            Patient

6.Discharge                                 Ward
                                            Edit
                                            Patient
                                            Transaction        
                                            

7. Display patient info                    Ward
                                           Doctor
                                           Patient
                                           Admit
                                           Report

8.Ward availability                        Ward
                                           Patient



