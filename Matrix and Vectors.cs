using System;
using System.Collections.Generic;
using System.Text;
using System.Linq;

namespace Sequence_Operations
{
    class Matrix_and_Vectors : Operations_on_Sequence
    {
       
       //public static int Dot_product(List<int> v, List<int> w)
       // {
       //     return Accumulate(Plus, 0,);
       // }
        private static List<int> Scalar_Product (List<List<int>> seqs)
        {
            List<int> collection_of_scalar_each_vektor = new List<int>();
            Func<List<int>, int> accumulate = x =>
            {
                return Accumulate(Plus, 0, x);
            };
            foreach(var i in seqs)
            {
                collection_of_scalar_each_vektor.Add(accumulate(i));
            }
            return collection_of_scalar_each_vektor;          
        }
        public  static List<int> Scalar_Product(List<int> vector_1, List<int> vector_2)
        {
            List<int> result = new List<int>();
            Adding_to_result(vector_1, vector_2);
            int Adding_to_result(List<int> i, List<int> j)
            {
                if (i.Count == 0 || j.Count == 0)
                {

                    return default;
                }
                else
                {
                    result.Add(Car(i) * Car(j));
                    return Adding_to_result(Cdr(i), Cdr(j));
                }
            }
            return result;

        }



    }
}
