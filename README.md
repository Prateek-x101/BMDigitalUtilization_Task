This Repository for a Task assigned by BM Digital Utilization as review of skills

Task - Create a Simple Product Listing Screen -  Fetches product data from API(https://fakestoreapi.com/products)

It displays product using lazyColumn

Each Item Shows :-
Product Image
Product Title 
Price

Tech Stack :- 
Kotlin
MVVM
Retrofit
ViewMOdel + LiveData
LazyColumn
Coil

SetUp Insatructions 
The app uses Internet. Internet Must be opened to make it working


Archietecture follows by :-

dataModel- Works as a container holding the api data
apiService - It gathers the data from the api endpoint  and save it in dataModel.
retrofitInstacne - Following base URL and apply necessary converting Json Object to Kotlin objects
ViewModel - The Logic area wher it holds the data save it for changes unesseccary data lost and fetch the real data form api
Product page - List full of products availebl at Api
MainActivity - Start fetching data insatantly app opens in background


