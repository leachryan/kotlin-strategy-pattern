# Strategy Pattern Example

In this example, I modeled two different dice rolling strategies used in DnD. These strategies are used by a context, which is executed by a client.

The two strategies have specific implementations that meet the requirements of the `RollStrategy` interface.

## Introduction

The strategy pattern is a design pattern that defines a group of algorithms, encapsulating each, and allows them to be interchangeable.

A strategy from the group of algorithms is chosen at runtime, without having to modify the client code.

The strategy pattern is useful in situations where different algorithms need to be used dynamically based on requirements or user preferences.

### Components

There are three main components of the strategy pattern:

1. Context
2. Strategy Interface
3. Concrete Strategies

#### Context

The context is the class that contains a reference to the strategy interface and is responsible for delegating to the chosen strategy.

#### Strategy Interface

The strategy interface defines the common methods that all the concrete strategies must implement.

#### Concrete Strategies

The concrete strategy classes encapsulate the specific algorithm implementations that adhere to the strategy interface.