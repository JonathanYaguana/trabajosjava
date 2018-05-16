    
#include <iostream>
#include <stdlib.h>
using namespace std;
string sms = "LA COLA ESTA VACIA";

template <class T>
class Cola;

template <class T>
class Nodo
{
private:
    T Dato;
    Nodo<T> *Siguiente;
public:
    Nodo(T dato)
    {
        this->Dato = dato;
        Siguiente = NULL;
    }
    friend class Cola<T>;
};

template<class T>
class Cola
{
private:
    Nodo<T> *Primero;
    Nodo<T> *Actual;
    bool ColaIsEmpty()
    {
        return (Primero==NULL);
    }
public:
    Cola()
    {
        Primero = NULL;
    }
    void Encolar(T);
    void Desencolar();
    void Mostar();
    void Vaciar();
};

template <class T>
void Cola<T>::Encolar(T dato)
{
    Nodo<T> *nuevo = new Nodo<T>(dato);
    if(!ColaIsEmpty())
    {
    Actual->Siguiente=nuevo;
    Actual = nuevo;
    }
    else
    {
        Primero = nuevo;
        Actual = nuevo;
    }
}

template <class T>
void Cola<T>::Mostar()
{
    if(!ColaIsEmpty())
    {
        Nodo<T> *tmp = Primero;
        while(tmp)
        {
            cout<<tmp->Dato<<" <---- ";
            tmp= tmp->Siguiente;
        }
    }
    else
    {
        cout <<sms<<endl;
    }
}
template <class T>
void Cola<T>::Desencolar()
{
    if(!ColaIsEmpty())
    {
        Nodo<T> *tmp = Primero;
        delete(Primero);
        Primero = tmp->Siguiente;
        cout<<"El dato desencolado es: "<<tmp->Dato<<endl;
        delete(tmp);
    }
    else
    {
        cout <<sms<<endl;
    }
}
template <class T>
void Cola<T>::Vaciar()
{
    if(!ColaIsEmpty())
    {
        char aux;
        cout <<"¿En realidad desea vaciar la cola? (S/N): ";
        cin >> aux;
        aux = tolower(aux);
        if(aux=='s')
        {
            while(Primero)
            {
                delete(Primero);
                Primero= Primero->Siguiente;
            }
            cout <<"ELIMINACION EXITOSA!!!"<<endl;
        }
        else
        {
            cout <<"OPERACION CANCELADA"<<endl;
        }
    }
    else
    {
        cout <<sms<<endl;
    }
}
int MENU()
{
    int op;
    cout <<"1  ENCOLAR"<<endl;
    cout <<"2  DESENCOLAR"<<endl;
    cout <<"3  VACIAR COLA"<<endl;
    cout <<"4  MOSTRAR"<<endl;
    cout <<"5  SALIR!!"<<endl;
    cout <<"Escriba una opcion:... ";
    cin >>op;
    return op;
}
int main()
{
    system("color 0a");

    Cola<int> objCola;
    int dato;

    int op;
    do
    {
        op = MENU();
        cout<<endl;
        switch(op)
        {
        case 1:
            char seguir;
            do
            {
                cout <<"Ingrese un elemento: ";
                cin >>dato;
                objCola.Encolar(dato);
                cout <<"Desea Ingresar otro ELEMENTO (S/N): ";
                cin>>seguir;
                seguir = tolower(seguir);
            }
            while(seguir =='s');
            cout<<endl<<endl;
            break;
        case 2:
            objCola.Desencolar();
            cout<<endl<<endl;
            break;
        case 3:
            objCola.Vaciar();
            cout<<endl<<endl;
            break;
        case 4:
            objCola.Mostar();
            cout<<endl<<endl;
            break;
        }
        system("pause");
        system("cls");
    }
    while(op != 5);
    return 0;
}





















