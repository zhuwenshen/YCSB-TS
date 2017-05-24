# YCSB-TS
[![Build Status](https://travis-ci.org/TSDBBench/YCSB-TS.svg?branch=master)](https://travis-ci.org/TSDBBench/YCSB-TS)

The benchmark used in TSDBBench to measure the performance of tims series databases (TSDBs).

YCSB-TS is a fork of [YCSB](http://github.com/brianfrankcooper/YCSB) that is adopted to use basic time domain functions and support timestamps and timeranges.

To achieve this, many new workload options are introduced, as well as bindings for many TSDBs.

The benchmark is usually executed using [Overlord](https://github.com/TSDBBench/Overlord).

## Supported databases
* Timeseries databases with a Requirement on NoSQL DBMS:
  * [Axibase](https://github.com/TSDBBench/Overlord/blob/master/docs/tsdb/axibase.md)
  * [Blueflood](https://github.com/TSDBBench/Overlord/blob/master/docs/tsdb/blueflood.md)
  * [Databus](https://github.com/TSDBBench/Overlord/blob/master/docs/tsdb/databus.md)
  * [KairosDB](https://github.com/TSDBBench/Overlord/blob/master/docs/tsdb/kairosdb.md)
  * [NewTS](https://github.com/TSDBBench/Overlord/blob/master/docs/tsdb/newts.md)
  * [OpenTSDB](https://github.com/TSDBBench/Overlord/blob/master/docs/tsdb/opentsdb.md)
  * [Rhombus](https://github.com/TSDBBench/Overlord/blob/master/docs/tsdb/rhombus.md)
  * [Graphite](https://github.com/TSDBBench/Overlord/blob/master/docs/tsdb/graphite.md)
* Timeseries databases with no Requirement on any DBMS:
  * [Akumuli](https://github.com/TSDBBench/Overlord/blob/master/docs/tsdb/akumuli.md)
  * [Druid](https://github.com/TSDBBench/Overlord/blob/master/docs/tsdb/druid.md)
  * [InfluxDB](https://github.com/TSDBBench/Overlord/blob/master/docs/tsdb/influxdb.md)
  * [Gnocchi](https://github.com/TSDBBench/Overlord/blob/master/docs/tsdb/gnocchi.md)
  * [Seriesly](https://github.com/TSDBBench/Overlord/blob/master/docs/tsdb/seriesly.md)
  * [Prometheus](https://github.com/TSDBBench/Overlord/blob/master/docs/tsdb/prometheus.md)
* Column-oriented DBMS
  * [MonetDB](https://github.com/TSDBBench/Overlord/blob/master/docs/tsdb/monetdb.md)
  * [Kdb+](https://github.com/TSDBBench/Overlord/blob/master/docs/tsdb/kdpplus.md)
* Relational databases:
  * [MySQL](https://github.com/TSDBBench/Overlord/blob/master/docs/tsdb/mysql.md)
  * [PostgreSQL](https://github.com/TSDBBench/Overlord/blob/master/docs/tsdb/postgresql.md)
* Other:
  * [Elasticsearch](https://github.com/TSDBBench/Overlord/blob/master/docs/tsdb/elasticsearch.md)
  * [h5serv](https://github.com/TSDBBench/Overlord/blob/master/docs/tsdb/h5serv.md)

## Unsupported databases (WIP)
*  [DalmatinerDB](https://github.com/TSDBBench/Overlord/blob/master/docs/tsdb/dalmatinerdb.md)
*  [ScyllaDB](https://github.com/TSDBBench/Overlord/blob/master/docs/tsdb/scylladb.md)
*  [RiakTS](https://github.com/TSDBBench/Overlord/blob/master/docs/tsdb/riakts.md)
*  [Redis](https://github.com/TSDBBench/Overlord/blob/master/docs/tsdb/redis.md)

## Get Started
* To build the full distribution, with all database bindings:
    `mvn clean package`
* The usage is the same as original YCSB, see the documentation [here](http://github.com/brianfrankcooper/YCSB).
    * new workload options are documented in [workload_template](workloads/workload_template) and [CoreWorkload.java](core/src/main/java/com/yahoo/ycsb/workloads/CoreWorkload.java)

## Additional Information
* Everything was tested and used on Debian Jessie x64, but should work on Ubuntu.
    * Ubuntu has different package names for a lot of the packages, you need to find and change them
* Logfiles/Benchmark Results are stored compressed as .ydc Files 
    
## Development Information
* See the [README.md of Overlord](https://github.com/TSDBBench/Overlord) for more information
* The original tests are untouched and therefore not working and should be fixed
* [Adding a New Database](docs/dev/adding_database.md)

## Related Links
* [YCSB on Github](http://github.com/brianfrankcooper/YCSB)
* [YCSB Wiki on Github](http://wiki.github.com/brianfrankcooper/YCSB)
* [Overlord](https://github.com/TSDBBench/Overlord)
* [Comparison of TSDBs (Andreas Bader)](http://www2.informatik.uni-stuttgart.de/cgi-bin/NCSTRL/NCSTRL_view.pl?id=DIP-3729&mod=0&engl=0&inst=FAK)
* [Survey and Comparison of Open Source TSDBs (Andreas Bader, Oliver Kopp, Michael Falkenthal)](http://www2.informatik.uni-stuttgart.de/cgi-bin/NCSTRL/NCSTRL_view.pl?id=INPROC-2017-06&mod=0&engl=0&inst=IPVS)
* [Ultimate Comparison of TSDBs](https://tsdbbench.github.io/Ultimate-TSDB-Comparison/)