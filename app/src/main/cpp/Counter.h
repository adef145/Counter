//
// Created by Ade Fruandta on 6/27/18.
//

#ifndef COUNTER_COUNTER_H
#define COUNTER_COUNTER_H


class Counter {

private: int counter = 0;

public:
    int count() {
        return ++counter;
    }
};


#endif //COUNTER_COUNTER_H
