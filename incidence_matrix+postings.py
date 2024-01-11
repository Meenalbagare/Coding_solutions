#TERM-DOCUMENT INCIDENCE MATRIX
# import numpy as np

# def create_term_document_matrix(documents):
#     unique_terms = set(term for doc in documents for term in doc)
#     unique_terms = sorted(list(unique_terms))

#     term_document_matrix = np.zeros((len(unique_terms), len(documents)), dtype=int)

#     for doc_idx, doc in enumerate(documents):
#         for term in doc:
#             term_idx = unique_terms.index(term)
#             term_document_matrix[term_idx, doc_idx] = 1

#     return term_document_matrix, unique_terms

# # Example usage:
# documents = [
#     ["apple", "banana", "orange"],
#     ["apple", "grape", "kiwi"],
#     ["orange", "kiwi", "melon"],
#     ["banana", "grape", "melon"]
# ]

# matrix, terms = create_term_document_matrix(documents)

# # Print the matrix and terms
# print("Term-Document Incidence Matrix:")
# print(matrix)
# print("\nTerms:")
# print(terms)


#TERM-DOCUMENT INCIDENCE MATRIX WITH AND,NOT,OR
# import numpy as np

# def create_term_document_matrix(documents):
#     unique_terms = set(term for doc in documents for term in doc)
#     unique_terms = sorted(list(unique_terms))

#     term_document_matrix = np.zeros((len(unique_terms), len(documents)), dtype=int)

#     for doc_idx, doc in enumerate(documents):
#         for term in doc:
#             term_idx = unique_terms.index(term)
#             term_document_matrix[term_idx, doc_idx] = 1

#     return term_document_matrix, unique_terms

# def logical_and(matrix1, matrix2):
#     return (np.logical_and(matrix1, matrix2)).astype(int)

# def logical_or(matrix1, matrix2):
#     return (np.logical_or(matrix1, matrix2)).astype(int)

# def logical_not(matrix):
#     return (np.logical_not(matrix)).astype(int)

# # Example usage:
# documents = [
#     ["apple", "banana", "orange"],
#     ["apple", "grape", "kiwi"],
#     ["orange", "kiwi", "melon"],
#     ["banana", "grape", "melon"]
# ]

# matrix, terms = create_term_document_matrix(documents)

# # Apply logical operations
# and_result = logical_and(matrix[:, 0], matrix[:, 1])
# or_result = logical_or(matrix[:, 0], matrix[:, 1])
# not_result = logical_not(matrix[:, 0])

# # Print results
# print("Term-Document Incidence Matrix:")
# print(matrix)
# print("\nLogical AND:")
# print(and_result)
# print("\nLogical OR:")
# print(or_result)
# print("\nLogical NOT:")
# print(not_result)


#POSTINGS LIST
from collections import defaultdict

def create_postings_list(documents):
    postings = defaultdict(list)

    for doc_id, document in enumerate(documents):
        for term in document:
            postings[term].append(doc_id+1)

    return postings

# Example usage:
documents = [
    ["apple", "banana", "orange"],
    ["apple", "grape", "kiwi"],
    ["orange", "kiwi", "melon"],
    ["banana", "grape", "melon"]
]

postings_list = create_postings_list(documents)

# Print the postings list
for term, document_ids in postings_list.items():
    print(f'Term: {term}, Postings List: {document_ids}')
