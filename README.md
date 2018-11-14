# TUGAS4
a. Buble Sort
Algoritma
Kami menganggap daftar adalah larik n elemen. Kami lebih lanjut mengasumsikan bahwa fungsi swap swap nilai-nilai elemen array yang diberikan. 
mulai BubbleSort (daftar)    
untuk semua elemen daftar      
 jika daftar [i]> daftar [i + 1]          
tukar (daftar [i], daftar [i + 1])      
berakhir jika    berakhir untuk  daftar kembali     
mengakhiri BubbleSort
Pseudocode
procedure bubbleSort( list : array of items )

   loop = list.count;
   
   for i = 0 to loop-1 do:
      swapped = false
		
      for j = 0 to loop-1 do:
      
         /* compare the adjacent elements */   
         if list[j] > list[j+1] then
            /* swap them */
            swap( list[j], list[j+1] )		 
            swapped = true
         end if
         
      end for
      
      /*if no number was swapped that means 
      array is sorted now, break the loop.*/
      
      if(not swapped) then
         break
      end if
      
   end for
   
end procedure return list

b. Insertion Sort
Algoritma
Langkah 1 - Jika itu adalah elemen pertama, itu sudah diurutkan. return 1; 
Langkah 2 - Pilih elemen berikutnya 
Langkah 3 - Bandingkan dengan semua elemen dalam sub-daftar yang diurutkan 
Langkah 4 - Geser semua elemen dalam sub-daftar yang diurutkan yang lebih besar dari nilai yang akan diurutkan
Langkah 5 - Masukkan nilainya 
Langkah 6 - Ulangi sampai daftar diurutkan
Pseudocode 
procedure insertionSort( A : array of items )
   int holePosition
   int valueToInsert
	
   for i = 1 to length(A) inclusive do:
	
      /* select value to be inserted */
      valueToInsert = A[i]
      holePosition = i
      
      /*locate hole position for the element to be inserted */
		
      while holePosition > 0 and A[holePosition-1] > valueToInsert do:
         A[holePosition] = A[holePosition-1]
         holePosition = holePosition -1
      end while
		
      /* insert the number at hole position */
      A[holePosition] = valueToInsert
      
   end for
	
end procedure

c. Selection Sort
Algoritma
Langkah 1 - Setel MIN ke lokasi 0 
Langkah 2 - Cari elemen minimum dalam daftar 
Langkah 3 - Tukar dengan nilai di lokasi MIN 
Langkah 4 - Menambah MIN untuk menunjuk ke elemen berikutnya 
Langkah 5 - Ulangi hingga daftar diurutkan
Pseudocode
procedure selection sort 
   list  : array of items
   n     : size of list

   for i = 1 to n - 1
   /* set current element as minimum*/
      min = i    
  
      /* check the element to be minimum */

      for j = i+1 to n 
         if list[j] < list[min] then
            min = j;
         end if
      end for

      /* swap the minimum element with the current element*/
      if indexMin != i  then
         swap list[min] and list[i]
      end if
   end for
	
end procedure

d. Merge Sort
Algoritma 
Langkah 1 - jika hanya satu elemen dalam daftar itu sudah diurutkan, kembali. 
Langkah 2 - bagilah daftar secara rekursif menjadi dua bagian hingga tidak dapat dibagi lagi. 
Langkah 3 - menggabungkan daftar yang lebih kecil ke dalam daftar baru dalam urutan terurut
Pseudocode
procedure mergesort( var a as array )
   if ( n == 1 ) return a

   var l1 as array = a[0] ... a[n/2]
   var l2 as array = a[n/2+1] ... a[n]

   l1 = mergesort( l1 )
   l2 = mergesort( l2 )

   return merge( l1, l2 )
end procedure

procedure merge( var a as array, var b as array )

   var c as array
   while ( a and b have elements )
      if ( a[0] > b[0] )
         add b[0] to the end of c
         remove b[0] from b
      else
         add a[0] to the end of c
         remove a[0] from a
      end if
   end while
   
   while ( a has elements )
      add a[0] to the end of c
      remove a[0] from a
   end while
   
   while ( b has elements )
      add b[0] to the end of c
      remove b[0] from b
   end while
   
   return c
	
end procedure


e. Shell Sort
Algoritma 
Langkah 1 - Inisialisasi nilai h 
Langkah 2 - Bagilah daftar menjadi sub-daftar yang lebih kecil dari interval yang sama h 
Langkah 3 - Urutkan sub-daftar ini menggunakan penyisipan 
Langkah 3 - Ulangi sampai daftar lengkap disortir
Pseudocode 
procedure shellSort()
   A : array of items 
	
   /* calculate interval*/
   while interval < A.length /3 do:
      interval = interval * 3 + 1	    
   end while
   
   while interval > 0 do:

      for outer = interval; outer < A.length; outer ++ do:

      /* select value to be inserted */
      valueToInsert = A[outer]
      inner = outer;

         /*shift element towards right*/
         while inner > interval -1 && A[inner - interval] >= valueToInsert do:
            A[inner] = A[inner - interval]
            inner = inner - interval
         end while

      /* insert the number at hole position */
      A[inner] = valueToInsert

      end for

   /* calculate interval*/
   interval = (interval -1) /3;	  

   end while
   
end procedure

f. Quick Sort 
Algoritma
Langkah 1 - Pilih nilai indeks tertinggi memiliki pivot 
Langkah 2 - Ambil dua variabel ke kiri dan kanan dari daftar tidak termasuk pivot
Langkah 3 - poin kiri ke indeks rendah 
Langkah 4 - tepat menunjuk ke tinggi 
Langkah 5 - sementara nilai di kiri kurang dari pivot bergerak ke kanan 
Langkah 6 - sementara nilai di kanan lebih besar dari pivot ke kiri 
Langkah 7 - jika kedua langkah 5 dan langkah 6 tidak cocok dengan swap kiri dan kanan 
Langkah 8 - jika dibiarkan ≥ kanan, titik di mana mereka bertemu adalah pivot baru
Pseudocode 
procedure quickSort(left, right)

   if right-left <= 0
      return
   else     
      pivot = A[right]
      partition = partitionFunc(left, right, pivot)
      quickSort(left,partition-1)
      quickSort(partition+1,right)    
   end if		
   
end procedure

g. Linear Search
Algoritma 
Pencarian Linear (Array A, Value x)
Langkah 1: Setel ke 1
Langkah 2: jika saya> lanjutkan ke langkah 7 
Langkah 3: jika A [i] = x, lanjutkan ke langkah 6 
Langkah 4: Setel saya ke i + 1 
Langkah 5: Lanjutkan ke Langkah 2 
Langkah 6: Elemen Cetak x Ditemukan di indeks i dan lanjutkan ke langkah 8 
Langkah 7: Elemen cetak tidak ditemukan 
Langkah 8: Keluar
Pseudocode
procedure linear_search (list, value)

   for each item in the list
      if match item == value
         return the item's location
      end if
   end for

end procedure
h. Binary Search
Algoritma
-
Pseudocode 
Procedure binary_search
   A ← sorted array
   n ← size of array
   x ← value to be searched

   Set lowerBound = 1
   Set upperBound = n 

   while x not found
      if upperBound < lowerBound 
         EXIT: x does not exists.
   
      set midPoint = lowerBound + ( upperBound - lowerBound ) / 2
      
      if A[midPoint] < x
         set lowerBound = midPoint + 1
         
      if A[midPoint] > x
         set upperBound = midPoint - 1 

      if A[midPoint] = x 
         EXIT: x found at location midPoint
   end while
   
end procedure
i. Hash table
