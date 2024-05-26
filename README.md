# Втора лабораториска вежба по Софтверско инженерство
## Ангела Прилепчанска, бр на индекс: 223138
### 2. Control Flow Graf:
   ![image](https://github.com/angelap11/SI_2024_lab2_223138/assets/164098234/890bb811-4532-4523-9342-c04740aafafb)
### 3.
   Цикломатската комплексност ја пресметав според следнава формула, E-N+2, каде што Е е бројот на ребра кој изнесува 37, според графот, а N  е бројот на јазли кој изнесува 29, па така 37-29+2=10, т.е цикломатската комплексност е 10.
### 4. Every Branch Criterium
   Every branch  C1	items=null, payment=500	items=emty list, payment =500	items(("item1","345",125,0.1),( null, "3d6",122,0.0)), payment=500	items(("eden","24",125,0.1,),("dva",null,111,0.2)), payment=500	items(("eden","055", 501,0.1),("dva,"333",210,0.0)) payment=500
1,2-4		*	*	*	*
1,2-3	*				
3-25	*				
4-5.1		*	*	*	*
5.1-5.2		*	*	*	*
5.2-22		*			*
22-23		*			
23-25		*			
22-24					*
24-25					*
5.2-6			*	*	*
6-7			*	*	*
7-8			*		
7-9			*	*	*
8-9			*		
9-10			*	*	*
9-19				*	
10-11			*	*	*
11-12.1			*	*	*
12.2-16			*	*	*
16-18					*
16-17			*	*	*
17-20			*	*	*
18-20					*
12.1-12.2			*	*	*
12.2-13			*	*	*
13-14			*	*	*
14-15					
15-25					
14-12.3			*	*	*
12.3-12.2			*	*	*
19-25				*	
20-21					*
20-5.3			*	*	*
21-5.3			*		*
5.3-5.2				*	*
![image](https://github.com/angelap11/SI_2024_lab2_223138/assets/164098234/299c828a-28cd-4108-afa5-fa2e642d3039)
Поради тоа што има 5 терминирачки патеки, потребно е во најмалку 5 test cases  да можеме да го истестираме кодот. Со горенаведените тест примери проверуваме дали секој од гранките означени во првата колона барем еднаш се изминати со тест примерите.
### 5. Multiple Condition
Multiple Condition			
T	T	T	5
T	T	F	/
T	F	X	6
F	X	X	3,4
![image](https://github.com/angelap11/SI_2024_lab2_223138/assets/164098234/3da469ea-3fc0-4592-bb04-a1cc34eb0057)
